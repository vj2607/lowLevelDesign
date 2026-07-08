package entities;

import java.util.Arrays;

public class VendingMachineMain {

	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine(4);
		Partition partition1 = new Partition(1, 4);
		Partition partition2 = new Partition(2, 4);
		Partition partition3 = new Partition(3, 4);
		Partition partition4 = new Partition(4, 4);
		Partition[] partitions = {partition1,partition2,partition3,partition4};
		machine.getInventory().setPartitions( partitions);
		try {
		System.out.println("Starting Vending Machine");
		System.out.println("Filling up the inventory");
		fillUpInventory(machine);
		}
		catch(Exception e) {
			
		}

	}

	private static void fillUpInventory(VendingMachine machine) {
		
		for(int i=0;i<machine.getInventory().getPartitions().length;i++) {
			for(int j=0;j<machine.getInventory().getPartitions()[i].getItems().length;j++) {
		}
		
		
	}
	}

}
