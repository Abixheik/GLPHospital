package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import config.GameConfiguration;
import game.Hospital;
import map.*;

public class PaintStrategy {
	public void paint(Hospital hospital, Graphics graphics) {
		int blockSize = GameConfiguration.BLOCK_SIZE;
		Block[][] blocks = hospital.getGround().getBlocks();


		for (int lineIndex = 0; lineIndex < hospital.getGround().getLineCount(); lineIndex++) {
			for (int columnIndex = 0; columnIndex < hospital.getGround().getColumnCount(); columnIndex++) {
				Block block = blocks[lineIndex][columnIndex];

				if (block.getIsBought()==false) {
					graphics.setColor(Color.GREEN);
					graphics.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize);
				}
			}
		}
	}
}
