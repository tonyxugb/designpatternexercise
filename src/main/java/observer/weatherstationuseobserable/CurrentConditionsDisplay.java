package observer.weatherstationuseobserable;

import java.util.Observable;
import java.util.Observer;

import observer.weatherstationcustom.DisplayElement;

/**
 *@Description:Observer也是Java内置的接口，每个观察者类都要实现该接口
 *@Author:tony
 *@Since:2015年9月10日
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	/**
	 * 主题变化时，会调用notifyObservers,而notifyObservers会调用每个观察者的update方法;
	 * 第一个参数是主题实例，方便观察者知道是哪个主题;
	 * 第二个参数是主题变化时，推给观察者的数据，如果为null，就只能从主题对象里"拉(pull)"数据了;
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			/**
			 * 观察者拉(pull)数据
			 */
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			/**
			 * 布告板上展示数据
			 */
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current Conditions:"+temperature+"F degrees"
				+ " and "+humidity+"% humidity");		
	}
}
