package entities;

public class Partition {
	int partitionNumber;
	ItemShelf[] items;
	
	public Partition(int n,int num ) {
		items = new ItemShelf[num];
		this.partitionNumber=n;
		initialEmptyInventory();
	}

	public void initialEmptyInventory() {
		int startCode=101;
	
			for(int i=0;i<items.length;i++) {
				ItemShelf shelf = new ItemShelf();
				shelf.setCode(startCode);
				shelf.setSoldOut(true);
				
				startCode++;
			}
			
		
	}

	public int getPartitionNumber() {
		return partitionNumber;
	}

	public void setPartitionNumber(int partitionNumber) {
		this.partitionNumber = partitionNumber;
	}

	public ItemShelf[] getItems() {
		return items;
	}

	public void setItems(ItemShelf[] items) {
		this.items = items;
	}
	
	

}
