package map;

import java.util.HashMap;

public class Map {
	private int lineCount;
	private int columnCount;
	Block [][] blocks;
	public Map(int lineCount, int columnCount){
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
	public void placeArea(int x, int y) {
		Area a = new Area(3,3, blocks[x][y]);
		for(int i=x;i<x+a.getHeight();i++) {
			for(int j=y;j<y+a.getHeight();j++) {
				this.blocks[i][j].setItem(a);
				System.out.println(blocks[i][j].getItem().getHearth());
			}
		}
	}
	public void areaToService(int x, int y) {
		Block h = blocks[x][y].getItem().getHearth();
		ItemPosition a= h.getItem();
		int x1= h.getLine();
		int y1= h.getColumn();
		Service s= new Service(a.getHeight(), a.getWidth(), "nom",a.getHearth());
		for(int i=x1;i<x1+a.getHeight();i++) {
			for(int j=y1;j<y1+a.getWidth();j++) {
				this.blocks[i][j].setItem(s);
			}
		}
		
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


