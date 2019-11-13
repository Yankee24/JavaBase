package day06_常用类库.md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MD5Demo2 {
	private static String savePassword = "pmq7VoTEWWLYh1ZPCDRujQ==";// 存储的密文
	
	public static void main(String[] args) {
		// md5Demo();
		System.out.println(login("admin123456"));
	}
	
	private static boolean login(String password) {
		if (savePassword.equals(md5(password))) {
			return true;
		} else {
			return false;
		}
	}
	
	// 计算MD5的工具方法
	private static String md5(String password) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			String newPassword = Base64.getEncoder().encodeToString(md5.digest(password.getBytes("utf-8")));
			return newPassword;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
