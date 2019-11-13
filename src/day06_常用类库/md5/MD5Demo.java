package day06_常用类库.md5;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class MD5Demo {
	public static void main(String[] args) {
		String password = "admin123456";
		// 确定计算方法
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");// SHA-1
			// 通过MD5计算摘要
			byte[] bytes = md5.digest(password.getBytes("utf-8"));
			System.out.println(Arrays.toString(bytes));
			// String newPassword = new String(bytes);
			// System.out.println(newPassword);
			// a-z 	A-Z 0-9 / *	BASE64编码算法
			// JDK1.8版本
			String newPassword = Base64.getEncoder().encodeToString(bytes);
			System.out.println(newPassword);
			byte[] byte2 = Base64.getDecoder().decode(newPassword);
			System.out.println(Arrays.toString(byte2));
			
			// JDK1.8之前
			// 加密
			BASE64Encoder base64 = new BASE64Encoder();
			String newPassword2 = base64.encode(bytes);
			System.out.println(newPassword2);
			// 解码
			BASE64Decoder base64Decoder = new BASE64Decoder();
			try {
				byte[] bytes3 = base64Decoder.decodeBuffer(newPassword2);
				System.out.println(Arrays.toString(bytes3));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
