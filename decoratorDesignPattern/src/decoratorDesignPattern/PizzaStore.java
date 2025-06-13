package decoratorDesignPattern;

public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//farmhose +extracheese
		basePizza pizza1 = new CheeseBurst(new FarmhousePizza());
		  System.out.println(pizza1.cost());
		  
		  //cheese + mushroom + barbeque
		  
		  basePizza p2 = new CheeseBurst(new Mushroom(new BarbequePizza()));
		  
		  System.out.println(p2.cost());
		  
	}

}
