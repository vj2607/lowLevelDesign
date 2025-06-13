package decoratorDesignPattern;

public class Pepperoni implements TopplingDecorator {


	basePizza basePizza;
	
	public Pepperoni(basePizza basePizza) {
		this.basePizza= basePizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+80;
	}
	
	
	
	

}
