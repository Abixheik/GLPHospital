package game;
import java.util.ArrayList;
import config.*;
import map.*;
public class Hospital {
	private int reputation;
	private double money;
	private Map map;
	public Hospital(int x, int y){
		money=1000.0;		
		reputation=50;
		map=new Map(x,y);
	}
	public int getReputation() {
		return this.reputation;
	}
	public double getMoney() {
		return money;
	}
	public Map getMap() {
		return map;
	}
	}

