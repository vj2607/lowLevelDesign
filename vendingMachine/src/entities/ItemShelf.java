package entities;

public class ItemShelf {
 
	int code;
	Item item;
	boolean isSoldOut;
	
	public ItemShelf() {
		
		this.isSoldOut=false;
	}
	
	public ItemShelf(int code,Item item) {
		this.code=code;
		this.item=item;
		this.isSoldOut=false;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public boolean isSoldOut() {
		return isSoldOut;
	}

	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}
	
	
	
}
