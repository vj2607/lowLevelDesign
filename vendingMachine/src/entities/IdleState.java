package entities;

import java.util.ArrayList;

public class IdleState extends State {

	public IdleState() {
		
	}
	
public IdleState(VendingMachine machine) {
		machine.coins= new ArrayList<>();
	}


@Override
 public void clickOnInsertCoin(VendingMachine machine) {
	 machine.setVendingMachineState(new InsertMoneyState());
 }
 
 @Override
 public void updateInventory(VendingMachine machine, Item item , int code,int partitionNum) throws Exception {
	 machine.inventory.addItem(code, item, partitionNum);
 }
	
}
