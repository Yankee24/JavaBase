package day10_网络编程.threadserver;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author xiao儿
 * @date 2019/9/12 9:25
 * @Description MutilClientDemo
 */
public class MutilClientDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // 创建一个Socket对象，指定要连接的服务器
            Socket socket = new Socket("localhost", 6666);
            // 获取socket输入输出流
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("请输入：");
            String info = sc.nextLine();
            ps.println(info);
            ps.flush();
            // 读取服务器端返回的数
            info = br.readLine();
            System.out.println(info);
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
