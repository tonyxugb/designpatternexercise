package factory.abstractdemo;

// 芝加哥原料工厂
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThickCrustDough(); //厚皮
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce(); //番茄沙司
	}

	@Override
	public Cheese createCheese() {
		return new HardCheese(); //硬质奶酪
	}
}
