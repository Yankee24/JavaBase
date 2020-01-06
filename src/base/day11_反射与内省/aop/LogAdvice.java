package base.day11_反射与内省.aop;

/**
 * @author xiao儿
 * @date 2019/9/10 19:10
 * @Description LogAdvice
 * 切面的实现类
 */
public class LogAdvice implements Advice {
    @Override
    public void beforeAdvice() {
        System.out.println("start time:" + System.currentTimeMillis());
    }

    @Override
    public void afterAdvice() {
        System.out.println("end time:" + System.currentTimeMillis());
    }
}
