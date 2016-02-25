package factory.factorymethod;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza(){
		name = "纽约风味Pizza";
		dough = "薄面团";
		sauce = "纽约风味酱料";
		
		toppings.add("纽约风味佐料");
	}
}
