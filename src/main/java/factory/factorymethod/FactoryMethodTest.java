package factory.factorymethod;

//166
public class FactoryMethodTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza nyPizza = nyStore.orderPizza("cheese");
		System.out.println("Tony成功预定了"+ nyPizza.name);
		System.out.println("-------------------");
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Pizza cgoPizza = chicagoStore.orderPizza("cheese");
		System.out.println("Jane成功预定了"+ cgoPizza.name);
	}
}
