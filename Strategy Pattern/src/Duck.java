//Abtract Base Class
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	//[abstrack] subclss to rewrite
	public abstract void Display() ;
	
	
	public void PerformQuack() {
		quackBehavior.quack();
	}
	
	public void PerformFly() {
		flyBehavior.fly();
	}
	
	//ABC can use the method
	public void  SetFlyBehavior(FlyBehavior fb) {
		flyBehavior=fb;
		
	}
	
	public void  SetQuackBehavior(QuackBehavior qb) {
		quackBehavior=qb;
		
	}
}
