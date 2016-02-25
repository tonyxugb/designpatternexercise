package factory.factorymethod;


public abstract class Pizza {
	
	public void prepare() {
		System.out.println("开始准备");
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
