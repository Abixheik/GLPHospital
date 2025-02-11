package map;


public class Ground {
	private int lineCount;
	private int columnCount;
	Block [][] blocks;
	public Ground(int lineCount, int columnCount){
		init(lineCount,columnCount);
		for (int lineIndex = 0; lineIndex < lineCount; lineIndex++) {
			for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
				blocks[lineIndex][columnIndex] = new Block(lineIndex, columnIndex);
			}
		}
	}
	
	
	
	private void init(int lineCount, int columnCount) { 
		this.lineCount=lineCount;
		this.columnCount=columnCount;
		this.blocks = new Block[lineCount][columnCount];
	}
	public Block[][] getBlocks() {
		return blocks;
	}

	public int getLineCount() {
		return lineCount;
	}

	public int getColumnCount() {
		return columnCount;
	}

	public Block getBlock(int line, int column) {
		return blocks[line][column];
	}

	public boolean isOnTop(Block block) {
		int line = block.getLine();
		return line == 0;
	}

	public boolean isOnBottom(Block block) {
		int line = block.getLine();
		return line == lineCount - 1;
	}

	public boolean isOnLeftBorder(Block block) {
		int column = block.getColumn();
		return column == 0;
	}

	public boolean isOnRightBorder(Block block) {
		int column = block.getColumn();
		return column == columnCount - 1;
	}

	public boolean isOnBorder(Block block) {
		return isOnTop(block) || isOnBottom(block) || isOnLeftBorder(block) || isOnRightBorder(block);
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int lineIndex = 0; lineIndex < lineCount; lineIndex++) {
			for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
				sb.append(blocks[lineIndex][columnIndex].toString()+"\n");
			}
		}
		return sb.toString();
	}
}


