
public class Mocha  extends CondimentDecorator{

	 Beverage beverage;
	 
	 public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	 
	@Override
	public String GetDescription() {
		return beverage.GetDescription()+",Mocha";
	}

	@Override
	public double Cost() {
		return beverage.Cost()+0.5;
	}

}
