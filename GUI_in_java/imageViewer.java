package GUI_in_java;
import java.awt.*;
import javax.swing.*;

public class imageViewer {
	JFrame frame = new JFrame("image viewer");
	JButton jb = new JButton("btn");
	
	
	public void makeFrame() {
		frame.setSize(400 , 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		jb.setSize(100 , 50);
		jb.setVisible(true);
		
		
	}
	
	imageViewer(){
		makeFrame();
	}

	
}
