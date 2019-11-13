package day10_网络编程.url;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author xiao儿
 * @date 2019/9/12 16:10
 * @Description URLDemo
 */
public class URLDemo {
    public static void main(String[] args) {
        // URL：统一资源定位符
        try {
            URL url = new URL("http://pic.netbian.com/uploads/allimg/190905/231431-15676964715fb0.jpg");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            BufferedInputStream in = new BufferedInputStream(httpURLConnection.getInputStream());
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("./Java入门/src/day10_网络编程/url/photo.jpg"));
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
                out.flush();
            }
            in.close();
            out.close();
            System.out.println("下载成功");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
