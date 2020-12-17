package detailedToDoList_beta;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CustomFrame extends JFrame{
	
	public CustomFrame() {
		this.setTitle("Welcome To Detailed To Do List");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(720, 650);
		this.setLayout(null);
		this.setVisible(true);
		
		//ImageIcon img = new ImageIcon("logo.jpg");
		//this.setIconImage(img.getImage());
		this.getContentPane().setBackground(Color.black);
	}
	
}
