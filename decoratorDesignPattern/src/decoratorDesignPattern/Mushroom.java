package decoratorDesignPattern;

public class Mushroom implements TopplingDecorator {

	private basePizza basePizza;
	
	public Mushroom(basePizza basePizza) {
		this.basePizza= basePizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+40;
	}
	
	
	

}
