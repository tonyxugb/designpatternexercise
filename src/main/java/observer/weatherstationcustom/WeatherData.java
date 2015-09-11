package observer.weatherstationcustom;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		/**
		 * ?
		 */
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o : this.observers){
			o.update(temperature, humidity, pressure);
		}
	}
	
	/**
	 * @Description:当气象站观测值变化时，通知观察者
	 * @Author:tony
	 * @Since:2015年9月9日
	 */
	public void measurementsChanged(){
		notifyObservers();
	}
	
	/**
	 * @Description:用来自行设置气象信息，方便测试
	 * @Author:tony
	 * @Since:2015年9月9日
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
