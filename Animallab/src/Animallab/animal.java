package Animallab;

import javax.swing.*;
import java.awt.*;

// Hassan Talha, Mr.Beck, 7th period
public class animal {
	
	JFrame frame;
	JPanel panel;
	
	animal(){
		
		frame = new JFrame("Animal Lab");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 800);
		frame.setBackground(null);
		frame.setResizable(false);
		
		panel = new JPanel() {
			
            public void paint(Graphics g) {
                super.paint(g);
                
                //background
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, 1000, 800);
                
                //kelp
                g.setColor(Color.GREEN);
                int[] n = {175, 150, 175, 150, 175, 150, 175, 225, 200, 225, 200, 225, 200, 225};
                int[] i = {505, 435, 365, 295, 225, 155, 85,   85, 155, 225, 295, 365, 435, 505};
                g.fillPolygon(n, i, 14);
                
                //oval or rock
                g.setColor(Color.DARK_GRAY);
                g.fillOval(25, 300, 950, 1500);
                
                //Star
                g.setColor(Color.YELLOW);
                int[] xPoints = {250, 425, 500, 575, 750, 600, 675, 500, 325, 400};
                int[] yPoints = {400, 375, 175, 375, 400, 525, 750, 600, 750, 525};
                g.fillPolygon(xPoints, yPoints, 10);
                
                //Fish
                g.setColor(Color.RED);
                g.fillOval(300, 25, 200, 75);
                int[] ex = {275, 305, 305, 275};
                int[] ey = {40, 50, 70, 80};
                g.fillPolygon(ex, ey, 4);
                
                //fish fin
                g.setColor(Color.YELLOW);
                int[] one = {350, 400, 365};
                int[] two = {60, 60, 85};
                g.fillPolygon(one, two, 3);
                
                //eyes
                g.setColor(Color.WHITE);
                g.fillOval(470, 45, 10, 10);
                g.setColor(Color.BLACK);
                g.fillOval(472, 47, 5, 5);
                
                //bubbles
                g.setColor(Color.WHITE);
                g.fillOval(509, 44, 12, 12);
                g.setColor(Color.BLUE);
                g.fillOval(510, 45, 10, 10);
                
                g.setColor(Color.WHITE);
                g.fillOval(524, 39, 10, 10);
                g.setColor(Color.BLUE);
                g.fillOval(525, 40, 8, 8);
                
                g.setColor(Color.WHITE);
                g.fillOval(539, 24, 8, 8);
                g.setColor(Color.BLUE);
                g.fillOval(540, 25, 6, 6);
            }
        };

        frame.add(panel);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		animal x = new animal();
	}
}
