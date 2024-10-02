package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener, KeyListener{

	JFrame frame;
	JTextField textfield;
	JTextArea textarea;
	JButton[] numbers = new JButton[10];
	JButton zero, one, two, three, four, five, six, seven, eight, nine;
	JButton[] functions = new JButton[8];
	JButton add, sub, mult, div, decimal, equal, negative, clear;
	JPanel panel;
	String newline;
	
	Font x = new Font("Serif Plain", Font.PLAIN, 20);
	Font y = new Font("Serif Plain", Font.PLAIN, 15);
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	
	
	Calculator(){
		
		//this makes the actual window
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(320, 450);
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		//makes the input box thing
		textfield = new JTextField();
		textfield.setBounds(15,65,290,50);
		textfield.setFont(x);
		textfield.setEditable(true);
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		//text area for the complete problem
		textarea = new JTextArea();
		textarea.setBounds(15, 15, 290, 40);
		textarea.setFont(y);
		textarea.setEditable(false);
		newline = "\n";
		textarea.setBackground(null);
		textarea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
	
		//all the functions
		add = new JButton("+");
		sub = new JButton("-");
		mult = new JButton("x");
		div = new JButton("/");
		decimal = new JButton(".");
		equal = new JButton("=");
		negative = new JButton("-/+");
		clear = new JButton("c");
		functions[0] = add;
		functions[1] = sub;
		functions[2] = mult;
		functions[3] = div;
		functions[4] = decimal;
		functions[5] = equal;
		functions[6] = negative;
		functions[7] = clear;
		
		for(int i = 0; i < functions.length; i++) {
			functions[i].addActionListener(this);
			functions[i].setFont(x);
		}
		
		equal.setBounds(15, 360, 290, 50);
		add.setBounds(255, 120, 50, 50);
		clear.setBounds(195, 120, 50, 50);
		negative.setBounds(135, 120, 50, 50);
		decimal.setBounds(75, 120, 50, 50);
		sub.setBounds(255, 180, 50, 50);
		mult.setBounds(255, 240, 50, 50);
		div.setBounds(255, 300, 50, 50);
		
		
		//all the numbers
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		numbers[0] = zero;
		numbers[1] = one;
		numbers[2] = two;
		numbers[3] = three;
		numbers[4] = four;
		numbers[5] = five;
		numbers[6] = six;
		numbers[7] = seven;
		numbers[8] = eight;
		numbers[9] = nine;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i].addActionListener(this);
			numbers[i].setFont(x);
		}
		
		zero.setBounds(195, 180, 50, 170);
		
		panel = new JPanel();
		panel.setBounds(15, 180, 170, 170);
		panel.setLayout(new GridLayout(3, 3, 10, 10));
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		
		
		//adding functions to the frame
		frame.add(equal);
		frame.add(add);
		frame.add(clear);
		frame.add(negative);
		frame.add(decimal);
		frame.add(sub);
		frame.add(mult);
		frame.add(div);
		
		
		//adding numbers to the frame
		frame.add(zero);
		frame.add(panel);
		
		
		//user input thingy
		frame.add(textfield);
		frame.add(textarea);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator x = new Calculator();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// makes numbers work
		for(int n = 0; n < numbers.length; n++) {
			if(e.getSource() == numbers[n]) {
				textfield.setText(textfield.getText().concat(String.valueOf(n)));
			}
		}
		
		// makes the clear button work
		if(e.getSource() == clear) {
			textfield.setText("");
			textarea.setText("");
			num1 = 0;
			operator = ' ';
		}
		
		// makes decimals work
		if(e.getSource() == decimal) {
			if(textfield.getText().contains(".")) {
			}
			else {
				textfield.setText(textfield.getText().concat("."));
			}
		}
		
		//negative positive button
		if(e.getSource() == negative) {
			if(textfield.getText().contains("-")) {
				textfield.setText(textfield.getText().replace("-", ""));
			}
			else {
				textfield.setText("-".concat(textfield.getText()));
			}
		}
		
		//multiply
		if(e.getSource() == mult) {
			num1 = Double.parseDouble(textfield.getText());
			textarea.setText(textfield.getText() + newline);
			textarea.append("x");
			operator = '*' ;
			textfield.setText("");
		}
		
		//divide
		if(e.getSource() == div) {
			num1 = Double.parseDouble(textfield.getText());
			textarea.setText(textfield.getText() + newline);
			textarea.append("/");
			operator = '/' ;
			textfield.setText("");
		}
		
		//add
		if(e.getSource() == add) {
			num1 = Double.parseDouble(textfield.getText());
			textarea.setText(textfield.getText() + newline);
			textarea.append("+");
			operator = '+' ;
			textfield.setText("");
		}
		
		//subtract
		if(e.getSource() == sub) {
			num1 = Double.parseDouble(textfield.getText());
			textarea.setText(textfield.getText() + newline);
			textarea.append("-");
			operator = '-' ;
			textfield.setText("");
		}
		
		//equal button
		if(e.getSource() == equal) {
				num2 = Double.parseDouble(textfield.getText());
				
				if(operator == '+') {
					result = num1 + num2;
				}
				else if(operator == '-') {
					result = num1 - num2;
				}
				else if(operator == '*') {
					result = num1 * num2;
				}
				else if(operator == '/') {
					result = num1 / num2;
				}
				String answer = Double.toString(result);
				
				textarea.setText("");
				textfield.setText(answer);
		}
		
	}

	public void keyTyped(KeyEvent e) {
		
		if(e.getKeyChar()=='1') {
			textfield.setText(textfield.getText().concat(String.valueOf('1')));
		}
		
		if(e.getKeyChar()=='2') {
			textfield.setText(textfield.getText().concat(String.valueOf('2')));
		}
		
		if(e.getKeyChar()=='3') {
			textfield.setText(textfield.getText().concat(String.valueOf('3')));
		}
		
		if(e.getKeyChar()=='4') {
			textfield.setText(textfield.getText().concat(String.valueOf('4')));
		}
		
		if(e.getKeyChar()=='5') {
			textfield.setText(textfield.getText().concat(String.valueOf('5')));
		}
		
		if(e.getKeyChar()=='6') {
			textfield.setText(textfield.getText().concat(String.valueOf('6')));
		}
		
		if(e.getKeyChar()=='7') {
			textfield.setText(textfield.getText().concat(String.valueOf('7')));
		}
		
		if(e.getKeyChar()=='8') {
			textfield.setText(textfield.getText().concat(String.valueOf('8')));
		}
		
		if(e.getKeyChar()=='9') {
			textfield.setText(textfield.getText().concat(String.valueOf('9')));
		}
		
		if(e.getKeyChar()=='0') {
			textfield.setText(textfield.getText().concat(String.valueOf('0')));
		}
		
		if(e.getKeyChar()=='.') {
			if(textfield.getText().contains(".")) {
			}
			else {
				textfield.setText(textfield.getText().concat("."));
			}
		}	
		
		if(e.getKeyChar()=='c') {
			textfield.setText("");
			textarea.setText("");
			num1 = 0;
			operator = ' ';
		}
		
		if(e.getKeyChar()=='+') {
			num1 = Double.parseDouble(textfield.getText());
			textarea.setText(textfield.getText() + newline);
			textfield.setText("");
			textarea.append("+");
			operator = '+' ;
		}
		
		if(e.getKeyChar()=='-') {
			num1 = Double.parseDouble(textfield.getText());
			textarea.setText(textfield.getText() + newline);
			textarea.append("-");
			operator = '-' ;
			textfield.setText("");
		}
		
		if(e.getKeyChar()=='*') {
			num1 = Double.parseDouble(textfield.getText());
			textarea.setText(textfield.getText() + newline);
			textarea.append("x");
			operator = '*' ;
			textfield.setText("");
		}
		
		if(e.getKeyChar()=='/') {
			num1 = Double.parseDouble(textfield.getText());
			textarea.setText(textfield.getText() + newline);
			textarea.append("/");
			operator = '/' ;
			textfield.setText("");
		}
		
		if(e.getKeyCode()==013){
			num2 = Double.parseDouble(textfield.getText());
			
			if(operator == '+') {
				result = num1 + num2;
			}
			else if(operator == '-') {
				result = num1 - num2;
			}
			else if(operator == '*') {
				result = num1 * num2;
			}
			else if(operator == '/') {
				result = num1 / num2;
			}
			String answer = Double.toString(result);
			
			textarea.setText("");
			textfield.setText(answer);
		}
	}
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
		equal.doClick();
		}

}
