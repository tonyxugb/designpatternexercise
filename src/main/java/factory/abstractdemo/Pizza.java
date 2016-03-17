package factory.abstractdemo;



public class Pizza{

	private Dough dough;
	private Sauce sauce;
	private Cheese cheese;
	
	private PizzaIngredientFactory factory;

	public void setFactory(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	public void prepare(){
		this.dough = this.factory.createDough();
		this.sauce = this.factory.createSauce();
		this.cheese = this.factory.createCheese();
		
		System.out.println("原料准备完毕");
	}
}
