package day10_网络编程.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author xiao儿
 * @date 2019/9/12 15:10
 * @Description UDPServerDemo
 */
public class UDPServerDemo {
    public static void main(String[] args) {
        String info = "good good 学习，天天 up";
        byte[] bytes = info.getBytes();
        try {
            // 封装一个数据报包
            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("127.0.0.1"), 8000);
            // 本程序的端口
            DatagramSocket socket = new DatagramSocket(9000);
            socket.send(dp);
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
