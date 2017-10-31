package dp.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by zwd on 2017/10/31.
 */
public class ShowProxy {

	public static void main(String[] args) {
		UserServiceImpl impl = new UserServiceImpl();
		Class[] interfaces = UserServiceImpl.class.getInterfaces();
		UserHandler handler = new UserHandler(impl);
		UserService userService =
			(UserService) Proxy.newProxyInstance(
				UserServiceImpl.class.getClassLoader(), interfaces, handler);
		userService.add();
	}

}
