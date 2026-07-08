package entities;

import java.util.List;

public class InsertMoneyState extends State {

	public InsertMoneyState() {
		System.out.println("Currently Vending machine is in InsertMoneyState");
	}

	@Override
	public void clickStartProductSelection(VendingMachine machine) {
		machine.setVendingMachineState(new SelectProductState());
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) {
		System.out.println("Inserting Coin:" + coin.value);
		machine.getCoins().add(coin);
	}

	@Override
	public List<Coin> getFullRefund(VendingMachine machine) {
		List<Coin> coins = machine.getCoins();
		System.out.println("Returning the full amount to user:");
		machine.setVendingMachineState(new IdleState(machine));
		return coins;
	}
}
