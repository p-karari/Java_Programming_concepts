package GUI_in_java;
import javax.swing.*;
import java.awt.*;

public class border_layout {
	public void layoutConfig() {
		JFrame border = new JFrame("Border Layout");

		JLabel north = new JLabel("North");
//		north.setVisible(true);
//		north.setSize(40, 40);
		JLabel east = new JLabel("East");
//		east.setVisible(true);
//		east.setSize(40, 40);
		JLabel centre = new JLabel("centre");
//		centre.setVisible(true);
//		centre.setSize(40, 40);
		JLabel west = new JLabel("West");
//		west.setVisible(true);
//		west.setSize(40, 40);
		JLabel south = new JLabel("South");
//		south.setVisible(true);
//		south.setSize(40, 40);
		
		
		border.setLayout(new BorderLayout(100 , 0));

		border.add(north , BorderLayout.NORTH);
		border.add(east ,BorderLayout.EAST);
		border.add(centre , BorderLayout.CENTER);
		border.add(west , BorderLayout.WEST);
		border.add(south , BorderLayout.SOUTH);
		
		border.setSize(400 , 350);
		border.setVisible(true);
		
		
		
	}

	public border_layout() {
		layoutConfig();
	}
	

}
