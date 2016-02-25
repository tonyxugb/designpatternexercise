package factory.simplefactory;

/**
 *@Description:简单工厂
 *@Author:tony
 *@Since:2016年2月24日
 */
public class SimplePizzaFactory {
	
	/**
	 * 1.这里有一个常见的技巧：把createPizza定义为static类型，好处是
	 * 不需要通过实例化SimplePizzaFactory的方式调用createPizza方法，
	 * 缺点是不能通过继承来改变创建方法的行为；
	 * 
	 * 2.这里入参最好不要用String，而是使用提前定义好的常量或者enum枚举类型的参数
	 */
	public Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new CheesePizza();
		} else if ("clam".equals(type)) {
			return new ClamPizza();
		} else if ("veggie".equals(type)) {
			return new VeggiePizza();
		}
		return null;
	}
}
