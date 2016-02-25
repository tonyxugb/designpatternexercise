package factory.simplefactory;

/**
 *@Description:工厂的抽象产品类
 *@Author:tony
 *@Since:2016年2月24日
 */
public abstract class Pizza {

	//pizza共有的内容
	public void bake() {
		System.out.println("bake...");
	}

	public void cut() {
		System.out.println("cut...");
	}
}
