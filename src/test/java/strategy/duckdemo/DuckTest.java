package strategy.duckdemo;

import strategy.duckdemo.behaviorImpl.FlyNoWay;
import strategy.duckdemo.behaviorImpl.FlyWithRocket;
import strategy.duckdemo.behaviorImpl.FlyWithWings;

public class DuckTest {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.setFlyBehavior(new FlyWithWings());
		duck.performFly();
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
		duck.setFlyBehavior(new FlyWithRocket());
		duck.performFly();
	}
}
