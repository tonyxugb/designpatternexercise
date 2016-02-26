package factory.abstractdemo;

public class NYPizzaStore extends PizzaStore{
	
	PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
	Pizza pizza = null;

	@Override
	public Pizza createPizza(String type) {
		if("cheese".equals(type)){
			pizza = new CheesePizza(pizzaIngredientFactory);
		}else if("clam".equals(type)){
			pizza = new ClamPizza(pizzaIngredientFactory);
		}
		return pizza;
	}

}
