package detailedToDoList_beta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SchedWindow implements ActionListener {
	
	CustomFrame cFrame = new CustomFrame();
	JPanel panelTop = new JPanel();
	JButton bButton = new JButton("Back");
	
	public SchedWindow() {
		panelTop.setBackground(Color.BLACK);
		panelTop.setBounds(0, 0, 720, 25);
		panelTop.setLayout(new BorderLayout());
		panelTop.add(bButton, BorderLayout.WEST);
		
		bButton.addActionListener(this);
		
		cFrame.add(panelTop);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bButton) {
			WelcomeFrame f = new WelcomeFrame();
			cFrame.dispose();
		}
	}
	
}
