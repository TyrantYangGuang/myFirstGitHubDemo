package cm.lql.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cm.lql.dao.ICar;

public class BayCarProxy implements InvocationHandler {
	private Object obj;

	public BayCarProxy() {
		
	}

	public static Object newInstance(Object realObj) {
		BayCarProxy carProxy = new BayCarProxy();
		carProxy.obj=realObj;
		return Proxy.newProxyInstance(realObj.getClass().getClassLoader(),realObj.getClass().getInterfaces(),carProxy);
		
	}




	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("准备工作");
		 method.invoke(obj, args);
		System.out.println("收尾工作");
		return null;
	}

}
