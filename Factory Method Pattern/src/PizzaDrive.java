
public class PizzaDrive {

	public static void main(String[] args) {
		PizzaStore aPizzaStore=new AStore();
		PizzaStore bPizzaStore=new BStore();
		
		Pizza pizza=aPizzaStore.OrderPizze("AA");
		System.out.println(pizza.Getname()+" has completed!\n");
		pizza=aPizzaStore.OrderPizze("AB");
		System.out.println(pizza.Getname()+" has completed!\n");
		
		pizza=bPizzaStore.OrderPizze("BB");
		System.out.println(pizza.Getname()+" has completed!\n");
		pizza=bPizzaStore.OrderPizze("BC");
		System.out.println(pizza.Getname()+" has completed!\n");
	}
}
