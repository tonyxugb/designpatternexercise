package factory.factorymethod;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		if("cheese".equals(type)){
			return new ChicagoStyleCheesePizza();
		}else if("clam".equals(type)){
			return new ChicagoStyleClamPizza();
		}
		return null;
	}

}
