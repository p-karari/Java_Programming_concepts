package GUI_in_java;
//import java.awt.*;
import javax.swing.*;

public class flowLayout_ {
	
	public void layoutInitialization() {
		JFrame flowLay = new JFrame("Flow layout demo"); 
		JLabel first = new JLabel("First");
		JLabel second = new JLabel("Second");
		JLabel third = new JLabel("Third string is long");
		JLabel fourth = new JLabel("fourth");
		JLabel fifth = new JLabel("fifth");
		
		flowLay.add(first);
		flowLay.add(second);
		flowLay.add(third);
		flowLay.add(fourth);
		flowLay.add(fifth);
		
		flowLay.setLayout(new FlowLayout());
		
	}

	public flowLayout_() {
		layoutInitialization();
	}

}
