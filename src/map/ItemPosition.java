package map;

public abstract class ItemPosition {
	private Block hearth;
	private Block[][] map;
	private int height;
	private int width;
	public ItemPosition(int height, int width, Block hearth) {
		this.height=height;
		this.width=width;
		this.hearth=hearth;
		this.map=new Block[height][width];
	}
	public int getHeight(){
		return height;
	}
	public int getWidth() {
		return width;
	}
	public Block[][] getMap() {
		return map;
	}
	public Block getHearth() {
		return hearth;
	}
	
}
