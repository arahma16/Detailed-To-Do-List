package detailedToDoList_beta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeFrame implements ActionListener{
	
	JPanel panelTop = new JPanel();
	JPanel panelMid1 = new JPanel();
	JPanel panelMid2 = new JPanel();
	JPanel panelBot = new JPanel();
	JLabel title = new JLabel("Welcome to Detailed TO DO List");
	JButton toDoButton = new JButton("To Do View");
	JButton calenButton = new JButton("Calendar View");
	JButton scheduleButton = new JButton("Schedule View");
	CustomFrame cFrame = new CustomFrame();

	
	public WelcomeFrame() {
		
		panelTop.setBackground(Color.RED);
		panelTop.setBounds(0, 0, 720, 25);		
		
		panelMid1.setBackground(Color.BLUE);
		panelMid1.setBounds(0, 25, 720, 200);
		
		panelMid2.setBackground(Color.YELLOW);
		panelMid2.setBounds(0, 225, 720, 200);
		
		panelBot.setBackground(Color.GREEN);
		panelBot.setBounds(0, 425, 720, 200);
		
		title.setForeground(Color.white);
		title.setVerticalAlignment(JLabel.TOP);
		title.setHorizontalAlignment(JLabel.CENTER);
		
		toDoButton.addActionListener(this);
		calenButton.addActionListener(this);
		scheduleButton.addActionListener(this);
		
		panelTop.add(title);
		panelMid1.add(toDoButton);
		panelMid2.add(scheduleButton);
		panelBot.add(calenButton);
		
		cFrame.add(panelTop);
		cFrame.add(panelMid1);
		cFrame.add(panelMid2);
		cFrame.add(panelBot);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==toDoButton) {
			ToDoListWindow newW = new ToDoListWindow();
			cFrame.dispose();
		}
		
		else if(e.getSource()==calenButton) {
			CalenWindow newW = new CalenWindow();
			cFrame.dispose();
		}
		
		else if(e.getSource()==scheduleButton) {
			SchedWindow newW = new SchedWindow();
			cFrame.dispose();
		}
		
	}
}
