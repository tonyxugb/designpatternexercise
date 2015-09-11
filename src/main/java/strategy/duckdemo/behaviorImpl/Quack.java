package strategy.duckdemo.behaviorImpl;

import strategy.duckdemo.behavior.QuackBehavior;

/**
 *@Description:鸭子叫行为组-普通鸭子叫
 *@Author:tony
 *@Since:2015年9月8日
 */
public class Quack implements QuackBehavior{

	public void quack() {
		System.out.println("Quack!");
	}

}
