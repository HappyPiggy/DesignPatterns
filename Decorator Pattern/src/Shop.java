
public class Shop {

	public static void main(String[] args) {
		Beverage beverage=new Espresso();
		System.out.println(beverage.GetDescription()+" $"+beverage.Cost());
		
		Beverage beverage2=new Cola();
		beverage2=new Mocha(beverage2);
		beverage2=new Mocha(beverage2);
		beverage2=new Soy(beverage2);
		System.out.println(beverage2.GetDescription()+" $"+beverage2.Cost());
		
		Beverage beverage3=new Sprite();
		beverage3=new Soy(beverage3);
		System.out.println(beverage3.GetDescription()+" $"+beverage3.Cost());
		
	}
}
