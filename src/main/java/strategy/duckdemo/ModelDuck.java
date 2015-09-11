package strategy.duckdemo;

public class ModelDuck extends Duck{

	/**
	 * 子类必须实现抽象父类的抽象方法
	 */
	@Override
	public void display() {
		System.out.println("I'm a model duck!");
	}

}
