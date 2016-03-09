package strategy.duckdemo;

import strategy.duckdemo.behavior.FlyBehavior;

/**
 *@Description:策略组的使用者-鸭子类
 *@Author:tony
 *@Since:2015年9月8日
 */
public class Duck {
	
	FlyBehavior flyBehavior;

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void performFly() {
		flyBehavior.fly();
	}
}
