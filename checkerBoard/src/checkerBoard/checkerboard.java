package checkerBoard;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

// Hassan Talha, Mr. Beck, 7th Period

public class checkerboard{
	
	JFrame frame;
	JPanel panel;

	checkerboard(){
		frame = new JFrame("Checkers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setBackground(null);
		frame.setResizable(false);
		
		panel = new JPanel() {
			
			
			
            public void paint(Graphics g) {
                super.paint(g);

                int squareSize = Math.min(getWidth() / 8, getHeight() / 8);

                for (int row = 0; row < 8; row++) {
                    for (int col = 0; col < 8; col++) {
                        if ((row + col) % 2 == 0) {
                            g.setColor(Color.BLACK);
                        } else {
                            g.setColor(Color.RED);
                        }
                        int x = col * squareSize;
                        int y = row * squareSize;
                        g.fillRect(x, y, squareSize, squareSize);
                    }
                }

                for (int row = 0; row < 3; row++) {
                    for (int col = (row) % 2; col < 8; col += 2) {
                        int x = col * squareSize + squareSize / 8;
                        int y = row * squareSize + squareSize / 8;
                        int diameter = squareSize * 3 / 4;
                        g.setColor(Color.WHITE);
                        g.fillOval(x - 1, y - 1, diameter + 2, diameter + 2); 
                        g.setColor(Color.BLACK);
                        g.fillOval(x, y, diameter, diameter); 
                    }
                }

                for (int row = 8 - 3; row < 8; row++) {
                    for (int col = (row) % 2; col < 8; col += 2) {
                        int x = col * squareSize + squareSize / 8;
                        int y = row * squareSize + squareSize / 8;
                        int diameter = squareSize * 3 / 4;
                        g.setColor(Color.WHITE);
                        g.fillOval(x - 1, y - 1, diameter + 2, diameter + 2);
                        g.setColor(Color.RED);
                        g.fillOval(x, y, diameter, diameter); 
                    }
                }
            }
        };

        frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void main (String[]args) {
		checkerboard x = new checkerboard();
	}
}
