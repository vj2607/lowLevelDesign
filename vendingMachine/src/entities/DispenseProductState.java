package entities;

public class DispenseProductState extends State {

	public DispenseProductState(VendingMachine machine, int code, int partitionNum) throws Exception {
		 System.out.println("Currently Vending machine is in DispenseState");
		dispenseProduct(machine, code, partitionNum);
	 
	}
	
	@Override
	public Item dispenseProduct(VendingMachine machine,int code,int partitionNum) throws Exception {
		Item item = machine.inventory.getItem(code, partitionNum);
		System.out.println("dispensing item ::"+item.name);
		machine.inventory.updateSoldOutItem(code, partitionNum);
		machine.setVendingMachineState(new IdleState(machine));
		return item;
	}

}
