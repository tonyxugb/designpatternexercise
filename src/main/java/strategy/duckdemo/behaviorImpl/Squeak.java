package strategy.duckdemo.behaviorImpl;

import strategy.duckdemo.behavior.QuackBehavior;

/**
 *@Description:鸭子叫行为组-吱吱叫
 *@Author:tony
 *@Since:2015年9月8日
 */
public class Squeak implements QuackBehavior{

	public void quack() {
		System.out.println("Squeak!");
	}

}
