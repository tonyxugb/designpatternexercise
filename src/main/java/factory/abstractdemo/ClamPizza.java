package factory.abstractdemo;

public class ClamPizza extends Pizza {

	private PizzaIngredientFactory pizzaIngredientFactory;
	
	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("准备ClamPizza");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}

}
