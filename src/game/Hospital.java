package game;
import java.util.ArrayList;
import config.*;
import map.*;
public class Hospital {
	private int reputation;
	private double money;
	private Ground ground;
	private ArrayList<Sector> sectors;
	public Hospital(){
		money=1000.0;		
		reputation=50;
		ground=new Ground(GameConfiguration.LINE_COUNT,GameConfiguration.COLUMN_COUNT);
		sectors=new ArrayList<Sector>();
	}
	public int getReputation() {
		return this.reputation;
	}
	public double getMoney() {
		return money;
	}
	public Ground getGround() {
		return ground;
	}
	public ArrayList<Sector> getSector(){
		return sectors;
	}
	public void buyBlock(int x, int y) {
		ground.getBlock(x, y).setIsBought(true);
	}
}
