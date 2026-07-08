package entities;

import java.util.List;

public abstract class State {

	public void clickOnInsertCoin(VendingMachine machine) {
		
	}
	
	public void insertCoin(VendingMachine machine, Coin coin) {
		
	}
	
	public void  clickStartProductSelection(VendingMachine machine) {
		
	}
	
	public void selectProduct(VendingMachine machine,int code,int partitionNum) throws Exception {
		
	}
	
	public Item dispenseProduct(VendingMachine machine,int code,int partitionNum) throws Exception {
		return null;
	}
	
	public List<Coin> getFullRefund(VendingMachine machine){
		
		return null;
	}
	
	public void updateInventory(VendingMachine machine, Item item , int code,int partitionNum) throws Exception {
		
	}
	
	public int getChange(int change) {
		return 0;
	}
}
