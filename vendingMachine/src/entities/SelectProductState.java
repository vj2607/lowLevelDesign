package entities;

import java.util.List;

public class SelectProductState extends State {

	
	 public SelectProductState() {
		 System.out.println("Vending Machine is in Select Product State");
	 }
	 
	 @Override
	 public void selectProduct(VendingMachine machine,int code,int partitionNum) throws Exception {
			Item item = machine.inventory.getItem(code, partitionNum);
			
			int paidByUser=0;
			
			for(Coin coin:machine.coins ) {
				paidByUser+=coin.value;
			}
			
			if(paidByUser<item.price) {
				throw new Exception("Insufficient funds");
			}
			else if(paidByUser>=item.price) {
				if(paidByUser>item.price) {
					getChange(paidByUser-item.price);
				}
				machine.setVendingMachineState(new DispenseProductState(machine,code,partitionNum ));
			}
		}
	 
	 @Override
		public List<Coin> getFullRefund(VendingMachine machine) {
			List<Coin> coins = machine.getCoins();
			System.out.println("Returning the full amount to user:");
			machine.setVendingMachineState(new IdleState(machine));
			return coins;
		}
	 
	 @Override
	 public int getChange(int change) {
		 System.out.println("returning extra money :"+change);
			return change;
		}
}
