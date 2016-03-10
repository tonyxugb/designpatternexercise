package factory.abstractdemo;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
//		PizzaStore nyStore = new NYPizzaStore();
//		Pizza pizza = nyStore.orderPizza("cheese");
		
		String s= "~-localhostnode1";
		System.out.println(s.hashCode());
		
		Map m = new HashMap();
		m.put(null, null);
		System.out.println(m.size());
	}
}
