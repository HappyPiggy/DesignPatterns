
public class Soy extends CondimentDecorator {

	 Beverage beverage;
	 
	 public Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	 
	@Override
	public String GetDescription() {
		return beverage.GetDescription()+",Soy";
	}

	@Override
	public double Cost() {
		return beverage.Cost()+0.8;
	}
}
