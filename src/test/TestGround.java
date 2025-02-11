package test;

import game.Hospital;
public class TestGround {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		System.out.println(h.getGround().toString());
		h.buyBlock(10, 2);
		System.out.println(h.getGround().toString());
	}
}
