package base.day10_网络编程.echo;

import java.io.*;
import java.net.Socket;

/**
 * @author xiao儿
 * @date 2019/9/12 9:25
 * @Description EchoClientDemo
 */
public class EchoClientDemo {
    public static void main(String[] args) {
        try {
            // 创建一个Socket对象，指定要连接的服务器
            Socket socket = new Socket("localhost", 6666);
            // 获取socket输入输出流
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ps.println("hello,my name is Tom");
            ps.flush();
            // 读取服务器端返回的数
            String info = br.readLine();
            System.out.println(info);
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
