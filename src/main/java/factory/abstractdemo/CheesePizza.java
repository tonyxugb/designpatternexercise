package factory.abstractdemo;

public class CheesePizza extends Pizza {

	private PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("准备CheesePizza");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}

}
