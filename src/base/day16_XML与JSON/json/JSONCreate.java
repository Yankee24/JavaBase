package base.day16_XML与JSON.json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiao儿
 * @date 2019/9/14 20:00
 * @Description JSONCreate
 */
public class JSONCreate {
    @Test
    public void createJSON() {
        List<Name> list = new ArrayList<>();
        list.add(new Name("Vince", "ma", "fsaf@33.com"));
        list.add(new Name("Bin", "fs", "12@w23.com"));
        JsonArray array = new JsonArray();
        for (Name name : list) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("firstName", name.getFirstName());
            jsonObject.addProperty("lastName", name.getLastName());
            jsonObject.addProperty("email", name.getEmail());
            array.add(jsonObject);
        }
        System.out.println(array.toString());
    }

    /**
     * 把一个JSON对象转换成JAVA对象，或把一个JAVA对象转换成JSON对象
     */
    @Test
    public void gson1() {
        Gson gson = new Gson();
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("day16_XML与JSON/json/name.json");
        InputStreamReader in = new InputStreamReader(is);
        Name name = gson.fromJson(in, Name.class);
        System.out.println(name);
        String s = gson.toJson(name);
        System.out.println(s);
    }

    /**
     * 把一组JSON对象转换成一个JAVA对象集合，或者把一个JAVA对象集合转换成JSON数组
     */
    @Test
    public void gson2() {
        Gson gson = new Gson();
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("day16_XML与JSON/json/names.json");
        InputStreamReader in = new InputStreamReader(is);
        TypeToken<List<Name>> type = new TypeToken<List<Name>>() {
        };
        List<Name> list = gson.fromJson(in, type.getType());
        System.out.println(list);
        String s = gson.toJson(list);
        System.out.println(s);
    }
}
