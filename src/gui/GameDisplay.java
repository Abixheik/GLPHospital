package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import game.Hospital;
import map.Ground;

public class GameDisplay extends JPanel{
	private Hospital hospital;
	private PaintStrategy paintStrategy = new PaintStrategy();
	public GameDisplay(Hospital hospital) {
		this.hospital= hospital;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		paintStrategy.paint(hospital, g);

	}

}
