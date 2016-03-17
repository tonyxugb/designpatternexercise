package factory.abstractdemo;


public class Test {
	public static void main(String[] args) {
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		Pizza p = new Pizza();
		p.setFactory(factory);
		p.prepare();
	}
}
