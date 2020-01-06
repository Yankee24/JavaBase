package base.day10_网络编程.communication;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiao儿
 * @date 2019/9/12 10:16
 * @Description Client
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExecutorService es = Executors.newSingleThreadExecutor();
        try {
            Socket socket = new Socket("localhost", 8888);
            System.out.println("服务器连接成功");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            // 向服务器发送登录消息
            System.out.println("请输入名称：");
            String name = sc.nextLine();
            Message message = new Message(name, null, MessageType.TYPE_LOGIN, null);
            oos.writeObject(message);
            message = (Message) ois.readObject();
            System.out.println(message.getInfo() + message.getFrom());
            // 启动读取消息的线程
            es.execute(new ReadInfoThread(ois));
            // 使用主线程来实现发送消息
            boolean flag = true;
            while (flag) {
                message = new Message();
                System.out.println("To：");
                message.setTo(sc.nextLine());
                message.setFrom(name);
                message.setType(MessageType.TYPE_SEND);
                System.out.println("Info：");
                message.setInfo(sc.nextLine());
                oos.writeObject(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 读取消息的线程
 */
class ReadInfoThread implements Runnable {
    private ObjectInputStream in;
    private boolean flag = true;

    public ReadInfoThread(ObjectInputStream in) {
        this.in = in;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            while (flag) {
                Message message = (Message) in.readObject();
                System.out.println("[" + message.getFrom() + "]对我说：" + message.getInfo());
            }
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}