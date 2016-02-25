package factory.abstractdemo;

public abstract class Pizza {
	
	//每个Pizza都持有一组在准备时会用到的原料
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	
	abstract void prepare(); //准备原料
}
