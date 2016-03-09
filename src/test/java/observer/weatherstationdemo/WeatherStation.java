package observer.weatherstationdemo;

import observer.weatherstationuseobserable.CurrentConditionsDisplay;
import observer.weatherstationuseobserable.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(28);
		weatherData.setMeasurements(22);
		weatherData.setMeasurements(23);
	}
}
