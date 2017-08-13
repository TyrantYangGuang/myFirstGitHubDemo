package cm.lql.test;

import cm.lql.dao.ICar;
import cm.lql.dao.impl.Benzhi;
import cm.lql.proxy.BayCarProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benzhi benzhi = new Benzhi();
		Object proxyObj = BayCarProxy.newInstance(benzhi);
		ICar realObj=(ICar) proxyObj;
		realObj.bayCar();

	}

}
