package factory.abstractdemo;

public interface PizzaIngredientFactory {

	public Dough createDough(); //制作面团
	
	public Sauce createSauce(); //调料
	
	public Cheese createCheese(); //奶油
}
