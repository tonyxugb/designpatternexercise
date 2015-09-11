package observer.weatherstationuseobserable;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		/**
		 * 类Observable自己实现了notifyObservers,
		 * 被通知的顺序和下面注册的顺序无关;
		 */
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(5, 10, 15);
		weatherData.setMeasurements(25, 30, 35);
		weatherData.setMeasurements(45, 50, 55);
	}
}
