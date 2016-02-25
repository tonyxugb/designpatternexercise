package factory.factorymethod;

/**
 *@Description:能够产生产品的类成为具体创建者
 *因为每个加盟店都有自己的PizzaStore子类，所以可以利用实现createPizza()创建自己风味的Pizza
 *@Author:tony
 *@Since:2016年2月24日
 */
public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if("cheese".equals(type)){
			return new NYStyleCheesePizza();
		}else if("clam".equals(type)){
			return new NYStyleClamPizza();
		}
		return null;
	}

}
