package day10_网络编程.echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xiao儿
 * @date 2019/9/12 9:19
 * @Description EchoServerDemo
 */
public class EchoServerDemo {
    public static void main(String[] args) {
        try {
            // 创建一个服务器端的Socket（2014~65535）
            ServerSocket server = new ServerSocket(6666);
            System.out.println("服务器已启动，正在等待客户端连接...");
            // 等待客户端的连接，造成阻塞，如果有客户端连接成功，立即返回一个Socket对象
            Socket accept = server.accept();
            System.out.println("客户端连接成功" + accept.getInetAddress().getHostAddress());
            BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            // 通过输入流来读取网络数据，如果没有消息，会造成阻塞
            String info = br.readLine();
            System.out.println(info);
            // 获取输出流，向客户端返回消息
            PrintStream ps = new PrintStream(new BufferedOutputStream(accept.getOutputStream()));
            ps.println("echo：" + info);
            ps.flush();
            // 关闭流
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
