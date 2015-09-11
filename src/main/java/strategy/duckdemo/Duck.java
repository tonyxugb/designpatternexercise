package strategy.duckdemo;

import strategy.duckdemo.behavior.FlyBehavior;
import strategy.duckdemo.behavior.QuackBehavior;

/**
 *@Description:鸭子超类
 *@Author:tony
 *@Since:2015年9月8日
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	/**
	 * @Description:Duck本身实现展现方法并无意义，需要让子类根据自身实际情况实现；
	 * 所以定义为abstract方法，Duck也就自然成了抽象类；
	 * @Author:tony
	 * @Since:2015年9月8日
	 */
	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		/**
		 * 所有的鸭子都会游泳，即便是玩具鸭!
		 */
		System.out.println("All ducks float,even decoys!");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
