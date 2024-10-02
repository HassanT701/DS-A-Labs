package Chesspiece;

import java.awt.*;
import javax.swing.*;

// Hassan Talha, Mr. Beck, 7th Period

public class chess {
	
	JFrame frame;
	JPanel panel;
	
	chess(){
		frame = new JFrame("Chess Piece");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 400);
		frame.setBackground(null);
		frame.setResizable(false);
		
		panel = new JPanel() {
			
            public void paint(Graphics g) {
                super.paint(g);
                
                g.setColor(Color.BLACK);
                g.fillRect(25, 325, 150, 10);
                g.fillRect(50, 300, 100, 25);
                g.fillRoundRect(62, 295, 75, 5, 10, 10);
                
                int[] xPoints = {70, 85, 115, 130};
                int[] yPoints = {295, 190, 190, 295}; 
                g.fillPolygon(xPoints, yPoints, 4);
                
                g.fillRect(50, 180, 100, 15);
                g.fillRoundRect(62, 175, 75, 5, 10, 10);
                g.fillRoundRect(70, 170, 60, 5, 10, 10);
                g.fillRoundRect(70, 165, 60, 5, 10, 10);
                g.fillRoundRect(75, 110, 50, 60, 50, 50);
                g.fillRect(87, 85, 25, 30);
          
            }
        };

        frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void main (String[]args) {
		chess x = new chess();
	}
}