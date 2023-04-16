package GUI_in_java;

import javax.swing.*;
import java.awt.*;

public class flow_layout {
	public void makeGrid() {
//		GridLayout gridDemo = new GridLayout(3,2 , 50 , 10);
		JFrame grid = new JFrame("Flow layout demo");
		
		JLabel firstName = new JLabel("First Name");
//		firstName.setSize(20 , 10);
//		firstName.setVisible(true);
		
		JTextField text1 = new JTextField(10);
//		text1.setSize(20 , 10);
//		text1.setVisible(true);
		
		JLabel lastName = new JLabel("First Name");
//		lastName.setSize(20 , 10);
//		lastName.setVisible(true);
		
		JTextField text2 = new JTextField(15);
//		text2.setSize(20 , 10);
//		text2.setVisible(true);
		
		grid.setLayout(new GridLayout(2 , 2 , 10 , 10));
		grid.setSize(200 , 100);
		grid.add(firstName);
		grid.add(lastName);
		grid.add(text1);
		grid.add(text2);
//		grid.setLocationRelativeTo(text2);
		grid.setVisible(true);
		
		
	}
	
	flow_layout() {
		makeGrid();
	}

}
