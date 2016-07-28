
public class BStore extends PizzaStore {

	@Override
	public Pizza CreatePizza(String type) {
		if(type.equals("BB")){
			return new BBstylePizza();
		}else if (type.equals("BC")) {
			return new BCStylePizza();
		}else {
			return null;
		}
	}

}
