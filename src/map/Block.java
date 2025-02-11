package map;

public class Block {
	private int line;
	private int column;
	private boolean isBought;

	public Block(int line, int column) {
		this.line = line;
		this.column = column;
		this.isBought=false;
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}
	public boolean getIsBought() {
		return isBought;
	}
	
	public void setIsBought(boolean b) {
		this.isBought=b;
	}
	@Override
	public String toString() {
		return "Block [line=" + line + ", column=" + column + "], is bought :" + isBought;
	}

}
