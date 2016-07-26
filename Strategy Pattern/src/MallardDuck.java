
public class MallardDuck extends Duck {
	
	public  MallardDuck() {
		//as for default
		quackBehavior=new Quack();
		flyBehavior=new FlyNoWay();
	}

	
	public void Display() {
		System.out.println("A Mallard Duck");
		
	}

}
