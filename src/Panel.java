import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.util.Random;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final int TILE_SIZE = 25;
	private static final int TERRAIN_HEIGHT = 8;

	public Panel() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(Window.getWidth(), Window.getHeight()));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Procedural Generation Code;
		for (int x = 0; x < quantityCubes() + 1; x++) {
			int height = randomNumber(-1, 4);
			for (int y = 0; y < Window.getHeight() - height; y++) {
				drawNewRect(g, x, TERRAIN_HEIGHT +  Window.getHeight()- y);
			}
			drawNewRect(g, x, TERRAIN_HEIGHT + Window.getHeight() - height);
		}
	}

	public void drawNewRect(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE); // X = WIDTH
	}

	private int quantityCubes() {
		int quantityCubes = Window.getWidth() / TILE_SIZE;
		return quantityCubes;
	}

	private int randomNumber(int low, int high) {
		Random r = new Random();
		int random = r.nextInt(high - low) + low;
		return random;
	}

}