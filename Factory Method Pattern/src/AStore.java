
public class AStore extends PizzaStore{

	@Override
	public Pizza CreatePizza(String type) {
		if(type.equals("AA")){
			return new AAstylePizza();
		}else if (type.equals("AB")) {
			return new ABStylePizza();
		}else {
			return null;
		}
	
	}

}
