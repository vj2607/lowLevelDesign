package entities;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

	List<Coin> coins;
	Inventory inventory;
	State vendingMachineState;
	
	public VendingMachine(int partitions) {
		this.coins= new ArrayList<>();
		this.inventory = new Inventory(partitions);
		this.vendingMachineState = new IdleState();
	}

	public List<Coin> getCoins() {
		return coins;
	}

	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public State getVendingMachineState() {
		return vendingMachineState;
	}

	public void setVendingMachineState(State vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}
	
	
	
}
