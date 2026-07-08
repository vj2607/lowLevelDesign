package entities;



public class Inventory {
	
    Partition[] partitions;
    
    public Inventory(int n) {
    	this.partitions = new Partition[n];
    	 
    }

	public Partition[] getPartitions() {
		return partitions;
	}

	public void setPartitions(Partition[] partitions) {
		this.partitions = partitions;
	}
	
	
	public void initialEmptyInventory() {
		int startCode=101;
		for(int i=0;i<partitions.length;i++) {
			for(int j=0;j<partitions[i].items.length;j++) {
				ItemShelf shelf = new ItemShelf();
				shelf.setCode(startCode);
				shelf.setSoldOut(true);
				partitions[i].items[j]=shelf;
				startCode++;
			}
			partitions[i].setPartitionNumber(i);
		}
	}
    
    public void addItem(int code,Item item,int partitionNumber) throws Exception {
    	
    	  for( Partition partition:partitions) {
    		  if(partition.getPartitionNumber()==partitionNumber) {
    		  for(ItemShelf shelf:partition.items) {
    			   if(shelf.code==code) {
    				   if(shelf.isSoldOut) {
    					   shelf.item=item;
    					   shelf.isSoldOut=false;
    				   }
    				   else {
    					   throw new Exception("Item already exists");
    				   }
    			   }
    		  }
    		  }
    	  }
    	
    }
    
    public Item getItem(int code , int partitionNumber) throws Exception {
    	        for(Partition partition:partitions) {
    	        	    if(partition.partitionNumber==partitionNumber) {
    	        	    	    for(ItemShelf shelf:partition.items) {
    	        	    	    	    if(shelf.code==code) {
    	        	    	    	    	    if(shelf.isSoldOut )
    	        	    	    	    	    	throw new Exception("Item already sold");
    	        	    	    	    	    	return shelf.item;
    	        	    	    	    }
    	        	    	    }
    	        	    }
    	        }
    	        throw new Exception("");
    }
    
    public void updateSoldOutItem(int code , int partitionNumber) {
    	for(Partition partition:partitions) {
    	    if(partition.partitionNumber==partitionNumber) {
    	    	    for(ItemShelf shelf:partition.items) {
    	    	    	    if(shelf.code==code) {
    	    	    	    	  shelf.isSoldOut=true;
    	    	    	    }
    	    	    }
    	    }
    	}
    }
    
    
    
    
    
}
