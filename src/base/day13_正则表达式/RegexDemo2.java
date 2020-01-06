package base.day13_正则表达式;

import org.junit.Test;

/**
 * @author xiao儿
 * @date 2019/9/3 23:06
 * @Description RegexDemo2
 */
public class RegexDemo2 {
    @Test
    public void test() {
        // 匹配电话号码
        String phoneNumber = "010-38389438";
        boolean b = phoneNumber.matches("\\d{3,4}-\\d{7,8}");
        System.out.println("电话号码匹配：" + b);

        // 匹配手机号码
        String phone = "13895271234";
        boolean b1 = phone.matches("[1][3-9]\\d{9}");
        System.out.println("手机号码匹配：" + b1);

        // 匹配用户名：字母开头，数字字母下划线组合
        String username = "abc1234";
        boolean b2 = username.matches("[a-zA-Z]+[\\w|_]*");
        System.out.println("用户名匹配：" + b2);

        // 匹配IP地址
        String ip = "192.168.1.1";
        boolean b3 = ip.matches("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}");
        System.out.println("IP地址匹配：" + b3);

        // 匹配网址
        String addr = "http://www.baid.com";
        boolean b4 = addr.matches("http://\\w+.\\w+.\\s*");
        System.out.println("网址匹配：" + b4);

        // 匹配年龄
        String age = "18";
        boolean b5 = age.matches("\\d{1,3}");
        System.out.println("年龄匹配：" + b5);

        // 匹配金额
        String price = "19.8";
        boolean b6 = price.matches("\\d+.\\d+");
        System.out.println("金额匹配：" + b6);
    }
}
