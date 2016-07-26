
import java.util.ArrayList;
//this class is as a  tool u can get weather data from it
public class WeatherData  implements Subject{

	private ArrayList observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers=new ArrayList();
	}
	
	@Override
	public void RegisterObserver(Observer o) {
		observers.add(o);
		
	}
	@Override
	public void RemoveObserver(Observer o) {
		int i=observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
		
	}
	@Override
	public void NotifyObservers() {
		for(int i=0;i<observers.size();i++){
			Observer observer=(Observer)observers.get(i);
			observer.Update(temp, humidity, pressure);
		}
		
	}
	
	//the funtion will be called when the new data coming
	public void measurementsChanged(){
		NotifyObservers();
	}
	
	//use the function to simulate get data
	public void SetData(float t,float h,float p){
		this.humidity=h;
		this.pressure=p;
		this.temp=t;
		measurementsChanged();
	}
	
	//other code
}
