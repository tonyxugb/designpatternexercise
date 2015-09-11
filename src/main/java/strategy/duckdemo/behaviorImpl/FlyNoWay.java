package strategy.duckdemo.behaviorImpl;

import strategy.duckdemo.behavior.FlyBehavior;

/**
 *@Description:飞行行为实现组-不会飞
 *@Author:tony
 *@Since:2015年9月8日
 */
public class FlyNoWay implements FlyBehavior{

	public void fly() {
		System.out.println("I can't fly!");
	}

}



