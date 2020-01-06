package base.day11_反射与内省.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiao儿
 * @date 2019/9/10 19:13
 * @Description ProxyFactory
 */
public class ProxyFactoryBean implements InvocationHandler {
    private Object target;
    private Advice advice;

    public Object getProxy() {
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        advice.beforeAdvice();
        Object invoke = method.invoke(target, args);
        advice.afterAdvice();
        return invoke;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}
