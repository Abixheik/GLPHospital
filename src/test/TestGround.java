package test;

import config.GameConfiguration;
import game.Hospital;
import map.Area;
public class TestGround {

	public static void main(String[] args) {
		Hospital h = new Hospital(10,10);
		System.out.println(h.getMap().toString());
		System.out.println(h.getMap().toString());
		System.out.println(h.getMap().getBlock(5, 5).getItem() instanceof Area);
		System.out.println(h.getMap().getBlock(5, 5));
	}
}
