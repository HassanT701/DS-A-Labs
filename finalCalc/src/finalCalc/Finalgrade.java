package finalCalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Finalgrade implements ActionListener{

	JFrame frame;
	
	JTextArea textarea, ans;
	JTextField tweight, fweight, want;
	JComboBox numterms;
	
	JTextField t1,t2, t3, t4, t5, ans1, ans2, ans3, ans4, ans5;
	
	JButton calc, clear;
	
	String newline;
	double count;
	double cur;
	double Want;
	double avg;
	double wt;
	double tot;
	double w;
	double Ans;
	double a;
	double One;
	double one;
	double two;
	double three;
	double four;
	double five;
	String A;
	
	Font y = new Font("Serif Plain", Font.BOLD, 12);
	Font x = new Font("Serif Plain", Font.BOLD, 13);
	
	Finalgrade(){
		
		frame = new JFrame("Final Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(320, 450);
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		textarea = new JTextArea();
		textarea.setBounds(15, 15, 140, 105);
		textarea.setFont(y);
		textarea.setEditable(false);
		textarea.setBackground(null);
		newline = "\n";
		textarea.setText("Total Term Weight:" + newline + newline);
		textarea.append("Final Weight:" + newline + newline);
		textarea.append("Number of Terms:" + newline + newline);
		textarea.append("Grade Wanted: ");
		
		tweight = new JTextField();
		tweight.setBounds(170,15,140,20);
		tweight.setFont(y);
		tweight.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		fweight = new JTextField();
		fweight.setBounds(170,45,140,20);
		fweight.setFont(y);
		fweight.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		String[] options = {"One", "Two", "Three", "Four", "Five"};
		numterms = new JComboBox(options);
		numterms.setBounds(170, 75, 140, 20);
		numterms.setFont(y);
		numterms.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		numterms.setSelectedIndex(0);
		numterms.addActionListener(this);
		count = 1.0;
		
		
		want = new JTextField();
		want.setBounds(170,105,140,20);
		want.setFont(y);
		want.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		
		t1 = new JTextField();
		t1.setBounds(10,145,145,20);
		t1.setFont(x);
		t1.setEditable(false);
		t1.setBackground(null);
		t1.setText("Term 1 Grade:");
		
		t2 = new JTextField();
		t2.setBounds(10,175,145,20);
		t2.setFont(x);
		t2.setEditable(false);
		t2.setBackground(null);
		t2.setText("Term 2 Grade:");
		t2.setForeground(Color.GRAY);
		
		t3 = new JTextField();
		t3.setBounds(10,205,145,20);
		t3.setFont(x);
		t3.setEditable(false);
		t3.setBackground(null);
		t3.setText("Term 3 Grade:");
		t3.setForeground(Color.GRAY);
		
		t4 = new JTextField();
		t4.setBounds(10,235,145,20);
		t4.setFont(x);
		t4.setEditable(false);
		t4.setBackground(null);
		t4.setText("Term 4 Grade:");
		t4.setForeground(Color.GRAY);
		
		t5 = new JTextField();
		t5.setBounds(10,265,145,20);
		t5.setFont(x);
		t5.setEditable(false);
		t5.setBackground(null);
		t5.setText("Term 5 Grade:");
		t5.setForeground(Color.GRAY);
		
		ans1 = new JTextField();
		ans1.setBounds(170, 145, 140, 20);
		ans1.setFont(y);
		ans1.setEnabled(true);
		
		ans2 = new JTextField();
		ans2.setBounds(170, 175, 140, 20);
		ans2.setFont(y);
		ans2.setEnabled(false);
		
		ans3 = new JTextField();
		ans3.setBounds(170, 205, 140, 20);
		ans3.setFont(y);
		ans3.setEnabled(false);
		
		ans4 = new JTextField();
		ans4.setBounds(170, 235, 140, 20);
		ans4.setFont(y);
		ans4.setEnabled(false);
		
		ans5 = new JTextField();
		ans5.setBounds(170, 265, 140, 20);
		ans5.setFont(y);
		ans5.setEnabled(false);
		
		
		calc = new JButton("Calculate");
		calc.addActionListener(this);
		calc.setFont(x);
		calc.setBounds(15, 295, 290, 30);
		calc.addActionListener(this);
		
		
		clear = new JButton("Clear");
		clear.addActionListener(this);
		clear.setFont(x);
		clear.setBounds(15, 330, 290, 30);
		clear.addActionListener(this);
		
		
		ans = new JTextArea();
		ans.setBounds(15, 375, 290, 40);
		ans.setFont(y);
		ans.setEditable(false);
		ans.setText("Calculate Grade Required On Final" + newline);
		ans.setBackground(null);
		
		
		frame.add(textarea);
		frame.add(tweight);
		frame.add(fweight);
		frame.add(numterms);
		frame.add(want);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(t5);
		frame.add(ans1);
		frame.add(ans2);
		frame.add(ans3);
		frame.add(ans4);
		frame.add(ans5);
		
		frame.add(calc);
		frame.add(clear);
		
		frame.add(ans);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalgrade x = new Finalgrade();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == clear) {
			tweight.setText("");
			fweight.setText("");
			want.setText("");
			ans1.setText("");
			ans2.setText("");
			ans3.setText("");
			ans4.setText("");
			ans5.setText("");
			cur = 0;
			Want = 0;
			avg = 0;
			wt = 0;
			tot = 0;
			w = 0;
			Ans = 0;
			a = 0;
			One = 0;
			one = 0;
			two = 0;
			three = 0;
			four = 0;
			five = 0;
			A = "";
			count = 1.0;
			ans.setText("Calculate Grade Required On Final" + newline);
			
		}
		
		if(e.getSource() == numterms) {
			int selectedIndex = numterms.getSelectedIndex();
			if(selectedIndex == 0) {
				ans2.setEnabled(false);
	            t2.setForeground(Color.GRAY);
	            ans3.setEnabled(false);
	            t3.setForeground(Color.GRAY);
	            ans4.setEnabled(false);
	            t4.setForeground(Color.GRAY);
	            ans5.setEnabled(false);
	            t5.setForeground(Color.GRAY);
			} else if (selectedIndex == 1) {
	            ans2.setEnabled(true);
	            t2.setForeground(null);
	            ans3.setEnabled(false);
	            t3.setForeground(Color.GRAY);
	            ans4.setEnabled(false);
	            t4.setForeground(Color.GRAY);
	            ans5.setEnabled(false);
	            t5.setForeground(Color.GRAY);
	            count = 2.0;
	        } else if (selectedIndex == 2) {
	            ans2.setEnabled(true);
	            t2.setForeground(null);
	            ans3.setEnabled(true);
	            t3.setForeground(null);
	            t4.setForeground(Color.GRAY);
	            ans5.setEnabled(false);
	            t5.setForeground(Color.GRAY);
	            count = 3.0;
	        } else if (selectedIndex == 3) {
	            ans2.setEnabled(true);
	            t2.setForeground(null);
	            ans3.setEnabled(true);
	            t3.setForeground(null);
	            ans4.setEnabled(true);
	            t4.setForeground(null);
	            ans5.setEnabled(false);
	            t5.setForeground(Color.GRAY);
	            count = 4.0;
	        } else if (selectedIndex == 4) {
	            ans2.setEnabled(true);
	            t2.setForeground(null);
	            ans3.setEnabled(true);
	            t3.setForeground(null);
	            ans4.setEnabled(true);
	            t4.setForeground(null);
	            ans5.setEnabled(true);
	            t5.setForeground(null);
	            count = 5.0;
	        }
			
		}
		
		if(e.getSource() == calc) {
			Want = Double.parseDouble(want.getText());
			
			if(count == 1.0) {
				avg = Double.parseDouble(ans1.getText());
				wt = Double.parseDouble(tweight.getText());
				cur = avg * (wt / 100.0);
			}
			else if(count == 2.0) {
				one = Double.parseDouble(ans1.getText());
				two = Double.parseDouble(ans2.getText());
				tot = one + two;
				avg = tot / 2.0;
				wt = Double.parseDouble(tweight.getText());
				cur = avg * (wt / 100.0);
			}
			else if (count == 3.0) {
				one = Double.parseDouble(ans1.getText());
				two = Double.parseDouble(ans2.getText());
				three = Double.parseDouble(ans3.getText());
				tot = one + two + three;
				avg = tot / 3.0;
				wt = Double.parseDouble(tweight.getText());
				cur = avg * (wt / 100.0);
			}
			else if(count == 4.0) {
				one = Double.parseDouble(ans1.getText());
				two = Double.parseDouble(ans2.getText());
				three = Double.parseDouble(ans3.getText());
				four = Double.parseDouble(ans4.getText());
				tot = one + two + three + four;
				avg = tot / 4.0;
				wt = Double.parseDouble(tweight.getText());
				cur = avg * (wt / 100.0);
			}
			else if(count == 5.0) {
				one = Double.parseDouble(ans1.getText());
				two = Double.parseDouble(ans2.getText());
				three = Double.parseDouble(ans3.getText());
				four = Double.parseDouble(ans4.getText());
				five = Double.parseDouble(ans4.getText());
				tot = one + two + three + four + five;
				avg = tot / 5.0;
				wt = Double.parseDouble(tweight.getText());
				cur = avg * (wt / 100.0);
			}
			
			One = Want - cur;
			w = Double.parseDouble(fweight.getText());
			Ans = One / (w / 100.0);
			A =  String.valueOf(Ans);
			
			ans.setText("Calculate Grade Required On Final" + newline + A);
			
		}
		
	}
}
