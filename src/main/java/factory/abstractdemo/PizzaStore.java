package factory.abstractdemo;

/**
 *@Description:抽象创建者类，定义了一个抽象的工厂方法，让子类实现此方法制造产品
 *@Author:tony
 *@Since:2016年2月24日
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		/**
		 * 抽象创建者通常包括依赖抽象产品的代码，而这些抽象产品由子类制作，创建者不需要真的知道在制造哪种具体的产品
		 */
		Pizza pizza = createPizza(type);
		pizza.prepare();
		return pizza;
	}

	/**
	 * @Description:抽象的工厂方法
	 * @Author:tony
	 * @Since:2016年2月24日
	 * @Param:@param type
	 * @Param:@return
	 * @Return:Pizza
	 */
	abstract Pizza createPizza(String type);
}
