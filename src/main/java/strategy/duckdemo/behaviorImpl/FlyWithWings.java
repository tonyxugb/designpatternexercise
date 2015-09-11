package strategy.duckdemo.behaviorImpl;

import strategy.duckdemo.behavior.FlyBehavior;

/**
 *@Description:飞行行为实现组-用翅膀飞
 *@Author:tony
 *@Since:2015年9月8日
 */
public class FlyWithWings implements FlyBehavior {

	public void fly() {
		System.out.println("I'm flying with wings!");
	}

}
