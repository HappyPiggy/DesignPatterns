
public abstract class PizzaStore {

	public Pizza OrderPizze(String type) {
		Pizza pizza;
		pizza=CreatePizza(type);
		
		pizza.Prepare();
		pizza.Bake();
		pizza.Cut();
		pizza.Box();
		
		return pizza;
	}
	
	public  abstract Pizza CreatePizza(String type) ;
}
