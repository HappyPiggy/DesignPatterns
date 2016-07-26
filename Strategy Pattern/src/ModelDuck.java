
public class ModelDuck extends Duck {

	public  ModelDuck() {
		//as for default
		quackBehavior=new Quack();
		flyBehavior=new FlyNoWay();
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
	}
	

}
