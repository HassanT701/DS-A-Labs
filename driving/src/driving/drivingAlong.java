package driving;

import java.awt.*;
import javax.swing.*;

// Hassan Talha, Mr.Beck, 7th period
public class drivingAlong {
	
	JFrame frame;
	JPanel panel;
	
	drivingAlong(){
		
		frame = new JFrame("Driving Along");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 800);
		frame.setBackground(null);
		frame.setResizable(false);
		
		panel = new JPanel() {
			
            public void paint(Graphics g) {
                super.paint(g);
               
                //sky
                g.setColor(Color.CYAN.brighter());
                g.fillRect(0, 0, 1000, 800);
                
                //grass
                g.setColor(Color.green.darker());
                g.fillRect(0, 450, 1000, 350);
                Color GRASS = new Color(0, 102, 0);
                g.setColor(GRASS);
                
                //road
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(350, 450, 300, 350);
                g.setColor(Color.YELLOW);
                g.fillRect(490, 450, 20, 50);
                g.fillRect(490, 520, 20, 75);
                g.fillRect(490, 615, 20, 75);
                g.fillRect(490, 710, 20, 75);
                
                //sun
                g.fillOval(-100, -100, 200, 200);
                
                //fence
                Color BROWN = new Color(102, 51, 0);
                g.setColor(BROWN);
                g.fillRect(300, 450, 10, 275);
                g.fillRect(0, 690, 300, 10);
                g.fillRect(0, 670, 300, 10);
                g.fillRect(40, 670, 10, 55);
                g.fillRect(150, 670, 10, 55);
                g.fillRect(250, 670, 10, 55);
                
                //sheep
                g.setColor(Color.BLACK);
                g.fillOval(50, 500, 35, 35);
                g.fillOval(60, 490, 8, 30);
                g.fillOval(85, 560, 10, 40);
                g.fillOval(165, 560, 10, 40);
                g.fillOval(195, 540, 40, 10);
                g.setColor(Color.WHITE);
                g.fillOval(60, 510, 150, 75);
                g.fillOval(57, 510, 5, 5);
                
                //car
                g.setColor(Color.BLACK);
                g.fillOval(360, 555, 20, 35);
                g.fillOval(460, 555, 20, 35);
                g.setColor(Color.RED); 
                g.fillRect(355, 470, 130, 100);
                g.fillRect(365, 460, 110, 10);
                g.setColor(Color.BLUE);
                g.fillRect(380, 480, 80, 50);
                g.setColor(Color.YELLOW);
                g.fillOval(360, 540, 25, 25);
                g.fillOval(455, 540, 25, 25);
                g.setColor(Color.BLACK);
                g.fillRect(395, 540, 50, 20);
                
                //clouds
                g.setColor(Color.WHITE);
                g.fillOval(550, 150, 150, 50);
                g.fillOval(600, 125, 150, 50);
                g.fillOval(570, 110, 150, 50);
                g.fillOval(100, 50, 150, 60);
                g.fillOval(150, 50, 150, 60);
                g.fillOval(75, 75, 150, 60);
                
                
            }
        };

        frame.add(panel);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		drivingAlong x = new drivingAlong();
	}
}
