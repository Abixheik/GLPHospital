package test;

import config.GameConfiguration;
import game.Hospital;
public class TestGround {

	public static void main(String[] args) {
		Hospital h = new Hospital(10,10);
		System.out.println(h.getGround().toString());
		h.buyBlock(9, 2);
		System.out.println(h.getGround().toString());
	}
}
