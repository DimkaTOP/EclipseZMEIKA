package lab5obr4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import lab5obr3.MyMouseListener;

public class myAction2 extends JFrame{
	public JFrame myFrame;
	public JButton myButton;
	public JTextField myText1;
	public JCheckBox myCheck;
	public JRadioButton myRButton;
	public static JLabel myLabel;

	public static void main(String[] args) {
		new myAction2();

	}
	public myAction2() {
		myFrame = new JFrame("Okno");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myButton = new JButton("1");
		myCheck = new JCheckBox("2");
		myRButton = new JRadioButton("3");
		
		myText1 = new JTextField();
		
		myLabel = new JLabel(" ");
		
		JPanel myPanel = new JPanel();
		
		myPanel.add(myButton);
		myPanel.add(myCheck);
		myPanel.add(myRButton);
		
		
		myButton.addMouseListener(new MyMouseAdapter());
		myCheck.addMouseListener(new MyMouseAdapter());
		myRButton.addMouseListener(new MyMouseAdapter());
		myText1.addMouseListener(new MyMouseAdapter());
		
		myFrame.add(myText1,BorderLayout.NORTH);
		
		myFrame.add(myPanel,BorderLayout.CENTER);
		
		myFrame.add(myLabel,BorderLayout.SOUTH);
		
		myFrame.pack();
		
		myFrame.setMinimumSize(new Dimension(200,100));
		myFrame.setVisible(true);
	}

}
class MyMouseAdapter extends MouseAdapter{
	public void mouseEntered(MouseEvent e) {
		myAction2.myLabel.setText(e.getComponent().getClass().toString());
	}
}
	


