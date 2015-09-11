package strategy.duckdemo.behaviorImpl;

import strategy.duckdemo.behavior.FlyBehavior;

/**
 *@Description:飞行行为实现组-坐着火箭飞
 *@Author:tony
 *@Since:2015年9月8日
 */
public class FlyWithRocket implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I am flying with rocket !");
	}

}



