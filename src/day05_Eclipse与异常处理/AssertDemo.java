package day05_Eclipse与异常处理;

public class AssertDemo {
	public static void main(String[] args) {
		int result = add(1, 10);
		assert result == 10 : "结果不正确";
	}
	
	private static int add(int a, int b) {
		return a + b;
	}
}
