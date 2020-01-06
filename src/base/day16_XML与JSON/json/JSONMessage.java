package base.day16_XML与JSON.json;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author xiao儿
 * @date 2019/9/14 19:22
 * @Description JSONMessage
 */
public class JSONMessage {
    /**
     * 使用JsonReader解析复杂数据
     */
    @Test
    public void parseJSONMessage() {
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("day16_XML与JSON/json/message.json");
        InputStreamReader in = new InputStreamReader(is);
        JsonReader reader = new JsonReader(in);
        ArrayList<Message> list = readMessageArray(reader);
        for (Message message : list) {
            System.out.println(message);
        }
    }

    /**
     * 读取Message数组
     * @param reader
     * @return
     */
    private ArrayList<Message> readMessageArray(JsonReader reader) {
        ArrayList<Message> list = new ArrayList<>();
        try {
            reader.beginArray();
            while (reader.hasNext()) {
                list.add(readerMessage(reader));
            }
            reader.endArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 解析一个Message对象
     * @param reader
     * @return
     */
    private Message readerMessage(JsonReader reader) {
        Message message = new Message();
        try {
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                if ("id".equals(name)) {
                    message.setId(reader.nextLong());
                } else if ("text".equals(name)) {
                    message.setText(reader.nextString());
                } else if ("geo".equals(name) && reader.peek() != JsonToken.NULL) {
                    message.setGeo(readGeo(reader));
                } else if ("user".equals(name)) {
                    message.setUser(readUser(reader));
                } else {
                    reader.skipValue();
                }
            }
            reader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

    /**
     * 解析Geo
     * @param reader
     * @return
     */
    private ArrayList<Double> readGeo(JsonReader reader) {
        ArrayList<Double> list = new ArrayList<>();
        try {
            reader.beginArray();
            while (reader.hasNext()) {
                list.add(reader.nextDouble());
            }
            reader.endArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 解析User
     * @param reader
     * @return
     */
    private User readUser(JsonReader reader) {
        User user = new User();
        try {
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                if ("name".equals(name)) {
                    user.setName(reader.nextString());
                } else if ("followers_count".equals(name)) {
                    user.setFollowers_count(reader.nextInt());
                } else {
                    reader.skipValue();
                }
            }
            reader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
