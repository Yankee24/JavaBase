package base.day05_Eclipse与异常处理;

/**
 * @author xiao儿
 * @date 2019年8月22日 下午7:49:52
 * @description 自定义异常
 * 
 * 自定义异常通常都是通过继承一个异常类来实现的
 * 1.Throwable
 * 2.Exception
 * 3.RuntimeException
 * 自定义异常通常的实现是重写父类的构造方法
 * 异常对象本身是没有实际功能，只是一个有意义的标识
 */
public class CustomException extends Exception {

	private static final long serialVersionUID = 5804852618252467959L;

	public CustomException() {
		super();
	}
	
	public CustomException(String message) {
		super(message);
	}
}
