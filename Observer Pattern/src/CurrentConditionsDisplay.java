

public class CurrentConditionsDisplay implements Observer,DisplayElement {

	private float temp;
	private float humidity;
	private float pressure;
	private Subject WeatherData; 
	
	public CurrentConditionsDisplay(Subject weatherdata) {
		 weatherdata.RegisterObserver(this);
		 this.WeatherData=weatherdata; //dont konw why stone a refer
	}
	
	public void Display() {
		System.out.println("ÎÂ¶È:"+temp+"Êª¶È:"+humidity+"Ñ¹Á¦:"+pressure);
	}

	@Override
	public void Update(float temp, float humidity, float pressure) {
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		Display();
	}

}
