package base.day05_Eclipse与异常处理;

/**
 * @author xiao儿
 * @date 2019年8月22日 下午8:00:03
 * @description User类
 */
public class User {
	private String userName;
	private String password;
	private int age;
	private String sex;

	public User() {
	}

	public User(String userName, String password, int age, String sex) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", age=" + age + ", sex=" + sex + "]";
	}

}
