package factory.simplefactory;

public class SimpleFactoryTest {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		store.orderPizza("cheese");
	}
}
