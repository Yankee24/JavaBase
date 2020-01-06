package base.day10_网络编程.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author xiao儿
 * @date 2019/9/12 15:18
 * @Description UDPClientDemo
 *
 * 客户端
 */
public class UDPClientDemo {
    public static void main(String[] args) {
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        try {
            DatagramSocket socket = new DatagramSocket(8000);
            System.out.println("正在接收数据中...");
            socket.receive(dp);// 接收数据
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println(s);
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
