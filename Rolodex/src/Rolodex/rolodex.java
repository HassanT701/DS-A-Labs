package Rolodex;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class rolodex implements ActionListener, ListSelectionListener {

	JFrame frame;
	JLabel first, last, num, addy;
	JTextField First, Last, Num, Addy;
	JButton save, add, change, delete;
	Font y = new Font("Serif Plain", Font.BOLD, 12);
	Font x = new Font("Serif Plain", Font.BOLD, 15);
	
	DefaultListModel<Contact> contactList;
	DefaultListModel<String> contactList2;
    JList<String> Names;
	
	rolodex(){
		frame = new JFrame("Rolodex");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550, 400);
		frame.setLayout(null);
		frame.setResizable(false);
		
		first = new JLabel();
		first.setFont(x);
		first.setText("First Name:");
		first.setBounds(175, 40, 100, 15);
		last = new JLabel();
		last.setFont(x);
		last.setText("Last Name:");
		last.setBounds(175, 80, 100, 15);
		num = new JLabel();
		num.setFont(x);
		num.setText("Phone Number:");
		num.setBounds(175, 120, 150, 15);
		addy = new JLabel();
		addy.setFont(x);
		addy.setText("Address:");
		addy.setBounds(175, 160, 100, 15);
		
		First = new JTextField();
		First.setFont(x);
		First.setBounds(325, 35, 200, 25);
		First.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		Last = new JTextField();
		Last.setFont(x);
		Last.setBounds(325, 75, 200, 25);
		Last.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		Num = new JTextField();
		Num.setFont(x);
		Num.setBounds(325, 115, 200, 25);
		Num.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		Addy = new JTextField();
		Addy.setFont(x);
		Addy.setBounds(325, 155, 200, 25);
		Addy.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		save = new JButton();
		save.setFont(x);
		save.setText("Save");
		save.setBounds(255, 250, 100, 35);
		save.setVisible(true);
		save.addActionListener(this);
		add = new JButton();
		add.setFont(x);
		add.setText("New");
		add.setBounds(370, 250, 100, 35);
		add.setVisible(true);
		add.addActionListener(this);
		
		change = new JButton();
		change.setFont(x);
		change.setText("Save Changes");
		change.setBounds(255, 250, 215, 35);
		change.setVisible(false);
		change.addActionListener(this);
		delete = new JButton();
		delete.setFont(x);
		delete.setText("Delete Contact");
		delete.setBounds(255, 290, 215, 35);
		delete.setVisible(false);
		delete.addActionListener(this);
		
		contactList = new DefaultListModel<>();
		contactList2 = new DefaultListModel<>();
		Names = new JList<>(contactList2);
		Names.setFont(y);
		Names.setBounds(0, 0, 165, 400);
		Names.setBackground(Color.GRAY);
		Names.addListSelectionListener(this);
		
		frame.add(first);
		frame.add(last);
		frame.add(num);
		frame.add(addy);
		
		frame.add(First);
		frame.add(Last);
		frame.add(Num);
		frame.add(Addy);
		
		frame.add(save);
		frame.add(add);
		
		frame.add(change);
		frame.add(delete);
		
		frame.add(Names);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		rolodex x = new rolodex();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == save) {
			String firstName = First.getText();
            String lastName = Last.getText();
            String phoneNumber = Num.getText();
            String address = Addy.getText();

            Contact newContact = new Contact(firstName, lastName, phoneNumber, address);
            contactList.addElement(newContact);
            
            String fullName = lastName + "_" + firstName;
            contactList2.addElement(fullName);
		}
		
		if(e.getSource() == add) {
			First.setText("");
			Last.setText("");
			Num.setText("");
			Addy.setText("");
		}
		
		if(e.getSource() == change) {
			String selected = Names.getSelectedValue();
		    for (int i = 0; i < contactList.size(); i++) {
		        Contact con = contactList.getElementAt(i);
		        String fullName = con.getLastName() + "_" + con.getFirstName();
		        if (fullName.equals(selected)) {
		            con.setFirstName(First.getText());
		            con.setLastName(Last.getText());
		            con.setPhoneNumber(Num.getText());
		            con.setAddress(Addy.getText());
		            contactList2.set(i, con.getLastName() + "_" + con.getFirstName());
		        }
		    }
			save.setVisible(true);
        	add.setVisible(true);
        	change.setVisible(false);
        	delete.setVisible(false);
        	First.setText("");
			Last.setText("");
			Num.setText("");
			Addy.setText("");
		}
		
		if(e.getSource() == delete) {
			String selected = Names.getSelectedValue();
            for (int i = 0; i < contactList.size(); i++) {
                Contact con = contactList.getElementAt(i);
                String fullName = con.getLastName() + "_" + con.getFirstName();
                if (fullName.equals(selected)) {
                	First.setText("");
        			Last.setText("");
        			Num.setText("");
        			Addy.setText("");
                	contactList2.remove(i);
                	contactList.remove(i);
                	save.setVisible(true);
                	add.setVisible(true);
                	change.setVisible(false);
                	delete.setVisible(false);
                }
            }
		}
	}
	
	public void valueChanged(ListSelectionEvent e) {
		if (!e.getValueIsAdjusting()) {
            String selected = Names.getSelectedValue();
            for (int i = 0; i < contactList.size(); i++) {
                Contact con = contactList.getElementAt(i);
                String fullName = con.getLastName() + "_" + con.getFirstName();
                if (fullName.equals(selected)) {
                	save.setVisible(false);
                	add.setVisible(false);
                	change.setVisible(true);
                	delete.setVisible(true);
                    First.setText(con.getFirstName());
                    Last.setText(con.getLastName());
                    Num.setText(con.getPhoneNumber());
                    Addy.setText(con.getAddress());
                } else{
                	save.setVisible(false);
                	add.setVisible(false);
                	change.setVisible(true);
                	delete.setVisible(true);
                }
            }
        }
	}
}