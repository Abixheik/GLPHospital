package map;

public class Block {
	private int line;
	private int column;
	private ItemPosition item;

	public Block(int line, int column) {
		this.line = line;
		this.column = column;
		this.item=null;
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}
	public ItemPosition getItem() {
		return item;
	}
	
	public void setItem(ItemPosition i) {
		this.item=i;
	}
	@Override
	public String toString() {
		if(item!=null) {
			return "Block [line=" + line + ", column=" + column + "] itemPos :"+ item.toString();
		}
		else {
			return "Block [line=" + line + ", column=" + column + "]";
		}
	}

}
