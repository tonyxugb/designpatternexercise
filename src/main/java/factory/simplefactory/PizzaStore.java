package factory.simplefactory;

/**
 *@Description:工厂的客户  - Pizza商店
 *@Author:tony
 *@Since:2016年2月24日
 */
public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza = factory.createPizza(type);
		pizza.bake();
		pizza.cut();
		return pizza;
	}
}
