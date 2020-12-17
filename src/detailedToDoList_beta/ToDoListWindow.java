package detailedToDoList_beta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ToDoListWindow implements ActionListener {
	
	CustomFrame cFrame = new CustomFrame();
	JPanel panelTop = new JPanel();
	JPanel panelBottom = new JPanel();
	JButton bButton = new JButton("Back");
	JButton calen = new JButton("Calendar");
	JButton addB = new JButton("+");
	JScrollPane scroll = new JScrollPane(panelBottom, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
	int num = 0;
	ArrayList<JLabel> a = new ArrayList<JLabel>();
	
	public ToDoListWindow() {
		initialize();
	}
	
	public void initialize() {
		panelTop.setBackground(Color.BLACK);
		panelTop.setBounds(0, 0, 720, 25);
		panelTop.setLayout(new BorderLayout());
		panelTop.add(bButton, BorderLayout.WEST);
		panelTop.add(calen, BorderLayout.CENTER);
		panelTop.add(addB, BorderLayout.EAST);
		bButton.addActionListener(this);
		addB.addActionListener(this);
		
		panelBottom.setBackground(Color.ORANGE);
		panelBottom.setBounds(0, 25, 720, 695);
		panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.PAGE_AXIS));
		
		cFrame.add(panelTop);
		cFrame.add(panelBottom);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bButton) {
			WelcomeFrame f = new WelcomeFrame();
			cFrame.dispose();
		}
		
		else if(e.getSource()==addB) {
			JLabel b = new JLabel("Please Enter Task Here");
			b.setBackground(Color.white);
			b.setOpaque(true);
			a.add(b);
			panelBottom.add(a.get(num), BorderLayout.NORTH);
			panelBottom.add(b);
			panelBottom.add(Box.createRigidArea(new Dimension(0,2)));
			num++;
			cFrame.revalidate();
		}			
	}
}
