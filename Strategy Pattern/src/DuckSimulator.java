
public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard=new MallardDuck();
		mallard.PerformFly();
		mallard.PerformQuack();
		
		Duck model=new ModelDuck();
		model.PerformFly();
		model.PerformQuack();
		model.SetFlyBehavior(new FlyWithWings());
		model.PerformFly();
		
	}
}
