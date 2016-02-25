package factory.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("开始准备" + name);
		System.out.println("揉面");
		System.out.println("添加酱料:" + sauce);
		System.out.println("添加佐料:");
		for(int i=0;i<toppings.size();i++){
			System.out.println(""+toppings.get(i));
		}
		
	}

	public void bake() {
		System.out.println("烘烤25分钟");
	}

	public void cut() {
		System.out.println("切成三角块");
	}

	public void box() {
		System.out.println("放到盒子中");
	}

}
