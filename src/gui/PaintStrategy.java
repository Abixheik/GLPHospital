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
		Block[][] blocks = hospital.getMap().getBlocks();


		for (int lineIndex = 0; lineIndex < hospital.getMap().getLineCount(); lineIndex++) {
			for (int columnIndex = 0; columnIndex < hospital.getMap().getColumnCount(); columnIndex++) {
				Block block = blocks[lineIndex][columnIndex];

				if (block.getItem() instanceof Area) {
					graphics.setColor(Color.GRAY);
					graphics.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize);
				}
				else if (block.getItem() instanceof Service) {
					graphics.setColor(Color.BLUE);
					graphics.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize);
				}
				
					else {
						graphics.setColor(Color.GREEN);
						graphics.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize);
					}
				}
			}
		}
	}
