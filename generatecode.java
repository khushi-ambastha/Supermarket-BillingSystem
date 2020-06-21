


import java.awt.Label;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;

public class generate  extends JFrame{
	String name,phone_no,date;
        double amount;
	int bill_no;
	float dis;


	public generate(int bill_id,String name2, String ph_no, String date2, double t_amount,float disper) {
		bill_no = bill_id;
		name = name2;
		phone_no = ph_no;
		date = date2;
		amount = t_amount;
                dis=disper;
		 System.out.println(dis+" hi");
       
        
		
		// TODO Auto-generated constructor stub
		setVisible(true);
		initialize();
	}


	private void initialize() {
		setBounds(100, 100, 450, 300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Label label = new Label("Name:");
		label.setBounds(160, 23, 47, 22);
		getContentPane().add(label);
		
		Label label_1 = new Label("Phone Number:");
		label_1.setBounds(114, 51, 93, 22);
		getContentPane().add(label_1);
		
		Label label_2 = new Label("Date:");
		label_2.setBounds(160, 79, 47, 22);
		getContentPane().add(label_2);
		
		Label label_6 = new Label("Total Amount:");
		label_6.setBounds(127, 107, 80, 22);
		getContentPane().add(label_6);
		
		Label label_7 = new Label("Discount:");
		label_7.setBounds(145, 135, 62, 22);
		getContentPane().add(label_7);
		
		Label label_8 = new Label("Amount Paid:");
		label_8.setBounds(127, 163, 80, 22);
		getContentPane().add(label_8);
		
		Label label_3 = new Label(name);
		label_3.setBounds(229, 23, 93, 22);
		getContentPane().add(label_3);
		
		Label label_4 = new Label(phone_no);
		label_4.setBounds(229, 51, 93, 22);
		getContentPane().add(label_4);
		
		Label label_5 = new Label(date);
		label_5.setBounds(229, 79, 93, 22);
		getContentPane().add(label_5);
		
		
		
		Label label_9 = new Label(String.valueOf(amount));
		label_9.setBounds(229, 107, 62, 22);
		getContentPane().add(label_9);
		
		double discount_amount = ((amount))*(dis)/100;
		
		Label label_10 = new Label(String.valueOf(discount_amount));
		label_10.setBounds(229, 135, 62, 22);
		getContentPane().add(label_10);
		
		double pricePaid =(amount)-discount_amount;
		
		Label label_11 = new Label(String.valueOf(pricePaid));
		label_11.setBounds(229, 163, 62, 22);
		getContentPane().add(label_11);
	}
}
