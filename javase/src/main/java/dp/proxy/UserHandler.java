package dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zwd on 2017/10/31.
 */
public class UserHandler implements InvocationHandler {

    private Object target;

    public UserHandler() {
    }

    public UserHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before exec");
        Object result = method.invoke(target, args);
        System.out.println("after exec");
        return result;
    }
}
