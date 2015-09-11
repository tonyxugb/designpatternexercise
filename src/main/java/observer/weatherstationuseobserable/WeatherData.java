package observer.weatherstationuseobserable;

import java.util.Observable;

/**
 * Obserable翻译为“可观察者”，Java内置的类(不是接口!);
 * WeatherData扩展了Observable;
 * 无需再自定义registerObserver、removeObserver、notifyObservers方法，
 * 因为Observable已经实现了，WeatherData继承了;
 * @Author:tony
 * @Since:2015年9月10日
 */
public class WeatherData extends Observable{
	private float temperature; //温度
	private float humidity; //湿度
	private float pressure; //气压
	
	public void measurementsChanged(){
		/**
		 * setChanged()方法(changed=true)标记状态已经改变的事实，
		 * notifyObservers在被调用时会先判断changed的值，如果为true，则通知观察者，通知完之后设置changed=false；
		 * 如果为false，不通知观察者；
		 * 所以每次调用notifyObservers之前都需要setChanged();
		 */
		setChanged();

		/**
		 * 如果想为每一位观察者"推(push)"数据，可以把要推送的数据当做notifyObservers(args)的入参；
		 * 否则，观察者就只能从可观察对象中"拉(pull)"数据 
		 */
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
