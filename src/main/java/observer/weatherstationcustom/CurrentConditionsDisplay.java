package observer.weatherstationcustom;

/**
 *@Description:实现了Observer接口，主题变化时，就会收到通知;
 *所有布告板都要实现DisplayElement接口
 *@Author:tony
 *@Since:2015年9月9日
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	/**
	 * 展示当前状况
	 */
	@Override
	public void display() {
		System.out.println("Current Conditions:"+temperature+"F degrees"
				+ " and "+humidity+"% humidity");
	}
}
