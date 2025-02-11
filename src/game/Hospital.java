package game;
import java.util.ArrayList;
import config.*;
import map.*;
public class Hospital {
	private int reputation;
	private double money;
	private Ground ground;
	private ArrayList<Sector> sectors;
	public Hospital(int x, int y){
		money=1000.0;		
		reputation=50;
		ground=new Ground(x,y);
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
		if (money>=100) {
		ground.getBlock(x, y).setIsBought(true);
		money-=100;
		System.out.println(ground.getBlock(x, y).toString());
		System.out.println(this.getMoney());
		}
		else {
			System.out.println("Pas d'argent");
		}
	}
}
