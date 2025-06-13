package decoratorDesignPattern;

public class CheeseBurst implements TopplingDecorator {

	basePizza basePizza;
	
	public CheeseBurst(basePizza basePizza) {
		this.basePizza= basePizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+40;
	}
	
	

}
