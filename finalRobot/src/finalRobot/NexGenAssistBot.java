package finalRobot;

import javax.swing.*;
import java.awt.*;

public class NexGenAssistBot{
    JFrame frame;
    JPanel panel;

    public NexGenAssistBot() {
    	
        frame = new JFrame("NexGenAssistBot");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D x = (Graphics2D) g;

                //background color
                x.setBackground(Color.BLACK);
                x.clearRect(0, 0, getWidth(), getHeight());

                //head
                x.setColor(Color.WHITE);
                x.fillOval(400, 150, 200, 150); 

                //eyes and connecting line
                x.setColor(Color.BLACK);
                x.fillOval(470, 200, 15, 15);
                x.fillOval(515, 200, 15, 15);
                x.drawLine(485, 207, 515, 207);

                //body
                x.setColor(Color.WHITE);
                x.fillOval(350, 250, 300, 400);

                //arms
                x.fillOval(240, 330, 130, 250); 
                x.fillOval(630, 330, 130, 250); 

                //legs
                x.fillOval(400, 600, 75, 200); 
                x.fillOval(525, 600, 75, 200); 

                //outlines
                x.setColor(Color.BLACK);
                x.drawOval(400, 150, 200, 150); 
                x.drawOval(350, 250, 300, 400); 
                x.drawOval(240, 330, 130, 250); 
                x.drawOval(630, 330, 130, 250); 
                x.drawOval(400, 600, 75, 200); 
                x.drawOval(525, 600, 75, 200); 
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new NexGenAssistBot();
    }
}