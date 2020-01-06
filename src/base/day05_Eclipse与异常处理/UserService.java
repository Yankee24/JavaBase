package base.day05_Eclipse与异常处理;

/**
 * @author xiao儿
 * @date 2019年8月22日 下午8:23:31
 * @description UserService类
 */
public class UserService {
	public User login(String userName, String password) throws CustomException {
		if (!"admin".equals(userName)) {
			throw new CustomException("用户名错误");
		}
		if (!"123456".equals(password)) {
			throw new CustomException("密码错误");
		}
		
		User user = new User("admin", "123456", 18, "男");
		return user;
	}
}
