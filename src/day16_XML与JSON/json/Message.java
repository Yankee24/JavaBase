package day16_XML与JSON.json;

import java.util.ArrayList;

/**
 * @author xiao儿
 * @date 2019/9/14 19:18
 * @Description Message
 */
public class Message {
    private long id;
    private String text;
    private ArrayList<Double> geo;
    private User user;

    public Message() {
    }

    public Message(long id, String text, ArrayList<Double> geo, User user) {
        this.id = id;
        this.text = text;
        this.geo = geo;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Double> getGeo() {
        return geo;
    }

    public void setGeo(ArrayList<Double> geo) {
        this.geo = geo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", geo=" + geo +
                ", user=" + user +
                '}';
    }
}
