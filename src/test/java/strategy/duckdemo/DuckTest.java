package strategy.duckdemo;

import strategy.duckdemo.Duck;
import strategy.duckdemo.ModelDuck;
import strategy.duckdemo.behaviorImpl.FlyNoWay;
import strategy.duckdemo.behaviorImpl.FlyWithWings;
import strategy.duckdemo.behaviorImpl.MuteQuack;
import strategy.duckdemo.behaviorImpl.Quack;
import strategy.duckdemo.behaviorImpl.Squeak;

public class DuckTest {
	public static void main(String[] args) {
		Duck duck = new ModelDuck();
		duck.setFlyBehavior(new FlyWithWings());
		duck.performFly();
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
		
		duck.setQuackBehavior(new Quack());
		duck.performQuack();
		duck.setQuackBehavior(new MuteQuack());
		duck.performQuack();
		duck.setQuackBehavior(new Squeak());
		duck.performQuack();
	}
}
