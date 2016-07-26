

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
		
		weatherData.SetData(80, 65, 30.4f);
		

		
	}
}
