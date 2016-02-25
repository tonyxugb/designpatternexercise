package factory.abstractdemo;

// 纽约原料工厂
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough(); //薄皮
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce(); //海员式沙司
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese(); //巴马干酪
	}

}
