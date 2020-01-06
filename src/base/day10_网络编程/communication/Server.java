package base.day10_网络编程.communication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiao儿
 * @date 2019/9/12 10:15
 * @Description Server
 * <p>
 * 服务器端
 */
public class Server {
    public static void main(String[] args) {
        // 保存客户端处理的线程
        Vector<UserThread> vector = new Vector<>();
        ExecutorService es = Executors.newFixedThreadPool(5);
        try {
            // 创建服务器端的Socket
            ServerSocket server = new ServerSocket(8888);
            System.out.println("服务器已启动，正在等待连接...");
            while (true) {
                Socket socket = server.accept();
                UserThread userThread = new UserThread(socket, vector);
                es.execute(userThread);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 客户端处理的线程
 */
class UserThread implements Runnable {
    private String name;// 客户端的用户名称（唯一）
    private Socket socket;
    private Vector<UserThread> vector;// 客户端处理线程的集合
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private boolean flag = true;

    public UserThread(Socket socket, Vector<UserThread> vector) {
        this.socket = socket;
        this.vector = vector;
        vector.add(this);
    }

    @Override
    public void run() {
        try {
            System.out.println("客户端：" + socket.getInetAddress().getHostAddress() + "已连接");
            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());
            while (flag) {
                // 读取消息对象
                Message message = (Message) ois.readObject();
                int type = message.getType();
                switch (type) {
                    case MessageType.TYPE_SEND:
                        String to = message.getTo();
                        UserThread ut;
                        int size = vector.size();
                        for (int i = 0; i < size; i++) {
                            ut = vector.get(i);
                            if (to.equals(ut.name) && ut != this) {
                                ut.oos.writeObject(message);
                                break;
                            }
                        }
                        break;
                    case MessageType.TYPE_LOGIN:
                        name = message.getFrom();
                        message.setInfo("欢迎你：");
                        oos.writeObject(message);
                        break;
                }
            }
            ois.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}