package factory.factorymethod;

public class FactoryMethodTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza nyPizza = nyStore.orderPizza("cheese");
		System.out.println("-------------------");
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Pizza cgoPizza = chicagoStore.orderPizza("cheese");
	}
}
