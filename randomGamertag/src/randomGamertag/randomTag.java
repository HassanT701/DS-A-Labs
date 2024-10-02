package randomGamertag;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class randomTag implements ActionListener {
	
	JFrame frame;
	JButton gen;
	JLabel time, mor, aft, nit, weapons, ak, ar, smg, knife, c4, glock, lmg, rpg; 
	JCheckBox one, two, three, a, b, c, d, e, f, g, h;
	String[] aa;
	String[] bb;
	
	JFrame frame2;
	JTextArea ans;
	String newline;
	
	Font y = new Font("Serif Plain", Font.BOLD, 12);
	Font x = new Font("Serif Plain", Font.BOLD, 15);
	Font r = new Font("Serif Plain", Font.BOLD, 25);
	
	randomTag(){
		frame = new JFrame("Random Gamer Tag");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550, 400);
		frame.setLayout(null);
		frame.setResizable(false);
		
		gen = new JButton();
		gen.setFont(y);
		gen.setText("Generate Names");
		gen.setBounds(200, 300, 150, 35);
		gen.setVisible(true);
		gen.addActionListener(this);
		
		time = new JLabel();
		time.setFont(x);
		time.setText("Time of day:");
		time.setBounds(75, 15, 175, 15);
		mor = new JLabel();
		mor.setFont(x);
		mor.setText("Morning");
		mor.setBounds(75, 75, 100, 15);
		aft = new JLabel();
		aft.setFont(x);
		aft.setText("Afternoon");
		aft.setBounds(75, 125, 100, 15);
		nit = new JLabel();
		nit.setFont(x);
		nit.setText("Night");
		nit.setBounds(75, 175, 100, 15);
		one = new JCheckBox();
		one.setBounds(175, 75, 25, 15);
		one.addActionListener(this);
		two = new JCheckBox();
		two.setBounds(175, 125, 25, 15);
		two.addActionListener(this);
		three = new JCheckBox();
		three.setBounds(175, 175, 25, 15);
		three.addActionListener(this);
		
		weapons = new JLabel();
		weapons.setFont(x);
		weapons.setText("Favorite Weapon:");
		weapons.setBounds(325, 15, 150, 15);
		ak = new JLabel();
		ak.setFont(x);
		ak.setText("AK-47");
		ak.setBounds(325, 75, 100, 15);
		ar = new JLabel();
		ar.setFont(x);
		ar.setText("AR-15");
		ar.setBounds(325, 100, 100, 15);
		smg = new JLabel();
		smg.setFont(x);
		smg.setText("MP-5");
		smg.setBounds(325, 125, 100, 15);
		knife = new JLabel();
		knife.setFont(x);
		knife.setText("Machette");
		knife.setBounds(325, 150, 100, 15);
		c4 = new JLabel();
		c4.setFont(x);
		c4.setText("C-4");
		c4.setBounds(325, 175, 100, 15);
		glock = new JLabel();
		glock.setFont(x);
		glock.setText("Glock 9");
		glock.setBounds(325, 200, 100, 15);
		lmg = new JLabel();
		lmg.setFont(x);
		lmg.setText("M-249");
		lmg.setBounds(325, 225, 100, 15);
		rpg = new JLabel();
		rpg.setFont(x);
		rpg.setText("RPG");
		rpg.setBounds(325, 250, 100, 15);
		a = new JCheckBox();
		a.setBounds(425, 75, 25, 15);
		a.addActionListener(this);
		b = new JCheckBox();
		b.setBounds(425, 100, 25, 15);
		b.addActionListener(this);
		c = new JCheckBox();
		c.setBounds(425, 125, 25, 15);
		c.addActionListener(this);
		d = new JCheckBox();
		d.setBounds(425, 150, 25, 15);
		d.addActionListener(this);
		e = new JCheckBox();
		e.setBounds(425, 175, 25, 15);
		e.addActionListener(this);
		f = new JCheckBox();
		f.setBounds(425, 200, 25, 15);
		f.addActionListener(this);
		g = new JCheckBox();
		g.setBounds(425, 225, 25, 15);
		g.addActionListener(this);
		h = new JCheckBox();
		h.setBounds(425, 250, 25, 15);
		h.addActionListener(this);
		
		frame.add(gen);	
		frame.add(time);
		frame.add(mor);
		frame.add(aft);
		frame.add(nit);
		frame.add(weapons);
		frame.add(ak);
		frame.add(ar);
		frame.add(smg);
		frame.add(knife);
		frame.add(c4);
		frame.add(glock);
		frame.add(lmg);
		frame.add(rpg);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(a);
		frame.add(b);
		frame.add(c);
		frame.add(d);
		frame.add(e);
		frame.add(f);
		frame.add(g);
		frame.add(h);
		frame.setVisible(true);
		
		frame2 = new JFrame("Random Gamer Tag");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(550, 400);
		frame2.setLayout(null);
		frame2.setResizable(false);
		
		ans = new JTextArea();
		ans.setBounds(50, 0, 450, 400);
		ans.setFont(r);
		ans.setEditable(false);
		ans.setBackground(null);
		
		newline = "\n";
		
		frame2.add(ans);
		frame2.setVisible(false);
	}
	
	public static void main(String[] args) {
		randomTag x = new randomTag();
	}

	public void actionPerformed(ActionEvent z) {
		
		if(z.getSource() == one) {
			two.setSelected(false);
			three.setSelected(false);
			aa = new String[] {"morning","dawn","sunrise"};
		}
		
		if(z.getSource() == two) {
			one.setSelected(false);
			three.setSelected(false);
			aa = new String[] {"afternoon","midday","lunchtime"};
		}
		
		if(z.getSource() == three) {
			one.setSelected(false);
			two.setSelected(false);
			aa = new String[] {"night","dusk","midnight"};
		}
		
		if(z.getSource() == a) {
			b.setSelected(false);
			c.setSelected(false);
			d.setSelected(false);
			e.setSelected(false);
			f.setSelected(false);
			g.setSelected(false);
			h.setSelected(false);
			bb = new String[] {"AK","rifle"};
		}
		
		if(z.getSource() == b) {
			a.setSelected(false);
			c.setSelected(false);
			d.setSelected(false);
			e.setSelected(false);
			f.setSelected(false);
			g.setSelected(false);
			h.setSelected(false);
			bb = new String[] {"AR","carbine"};
		}
		
		if(z.getSource() == c) {
			a.setSelected(false);
			b.setSelected(false);
			d.setSelected(false);
			e.setSelected(false);
			f.setSelected(false);
			g.setSelected(false);
			h.setSelected(false);
			bb = new String[] {"SMG","P90"};
		}

		if(z.getSource() == d) {
			a.setSelected(false);
			b.setSelected(false);
			c.setSelected(false);
			e.setSelected(false);
			f.setSelected(false);
			g.setSelected(false);
			h.setSelected(false);
			bb = new String[] {"katana","sword"};
		}

		if(z.getSource() == e) {
			a.setSelected(false);
			b.setSelected(false);
			c.setSelected(false);
			d.setSelected(false);
			f.setSelected(false);
			g.setSelected(false);
			h.setSelected(false);
			bb = new String[] {"explosive","boomboom"};
		}

		if(z.getSource() == f) {
			a.setSelected(false);
			b.setSelected(false);
			c.setSelected(false);
			d.setSelected(false);
			e.setSelected(false);
			g.setSelected(false);
			h.setSelected(false);
			bb = new String[] {"glock","pistol"};
		}

		if(z.getSource() == g) {
			a.setSelected(false);
			b.setSelected(false);
			c.setSelected(false);
			d.setSelected(false);
			e.setSelected(false);
			f.setSelected(false);
			h.setSelected(false);
			bb = new String[] {"LMG","machinegun"};
		}

		if(z.getSource() == h) {
			a.setSelected(false);
			b.setSelected(false);
			c.setSelected(false);
			d.setSelected(false);
			e.setSelected(false);
			f.setSelected(false);
			g.setSelected(false);
			bb = new String[] {"RPG","rocket"};
		}
		
		if(z.getSource() == gen) {
			frame.setVisible(false);
			frame2.setVisible(true);
			
			for(int x = 0; x < aa.length; x++) {
				for(int y = 0; y < bb.length; y++) {
					ans.append(aa[x] + bb[y] + newline + newline);
				}
			}
			
		}
	}

	
}
