package factory.factorymethod;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza(){
		name = "芝加哥风味Pizza";
		dough = "厚面团";
		sauce = "芝加哥风味酱料";
		
		toppings.add("芝加哥风味佐料");
	}
	
	//覆盖父类的cut方法
	public void cut(){
		System.out.println("切成方块");
	}
}
