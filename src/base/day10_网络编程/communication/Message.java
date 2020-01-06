package base.day10_网络编程.communication;

import java.io.Serializable;

/**
 * @author xiao儿
 * @date 2019/9/12 10:42
 * @Description Message
 *
 * 消息包
 */
public class Message implements Serializable {
    private String from;// 发送者
    private String to;// 接收者
    private int type;// 消息类型
    private String info;// 消息

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Message() {
    }

    public Message(String from, String to, int type, String info) {
        this.from = from;
        this.to = to;
        this.type = type;
        this.info = info;
    }
}
