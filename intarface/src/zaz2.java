import java.util.ArrayList;
import java.util.ArrayList.*;
import java.awt.*;
import javax.swing.*;

public class zaz2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,500);
		
		setNorth(frame);
		setWest(frame);
		setEast(frame);
		setCenter(frame);
		setSouth(frame);
		frame.setVisible(true);
		frame.pack();
		frame.setMinimumSize(frame.getSize());
}
	public static void setNorth (JFrame fr) {
		JPanel myPanel1 = new JPanel();
		myPanel1.setLayout(new FlowLayout());
		myPanel1.add(new JButton ("Кнопка 1"));
		JButton myButton2 = new JButton
				("<html><b><font color=\"green\" size=14>Кнопка 2</font></b></html>");
		Component horizontalStrut = Box.createHorizontalStrut(40);
		myPanel1.add(horizontalStrut);
		myPanel1.add(myButton2);
		fr.add(myPanel1,BorderLayout.NORTH);
	}
	public static void setWest (JFrame fr) {
		Box myBox1 = new Box(BoxLayout.Y_AXIS);
		myBox1.add(Box.createVerticalStrut(20));
		myBox1.add(new JLabel("Метка 1"));
		myBox1.add(Box.createVerticalGlue());
		myBox1.add(new JLabel("Метка 2"));
		myBox1.add(Box.createVerticalGlue());
		myBox1.add(new JCheckBox ("Выбор"));
		myBox1.add(Box.createVerticalStrut(20));
		fr.add(myBox1, BorderLayout.WEST);
	}
	public static void setEast (JFrame fr) {
		ButtonGroup myGroup = new ButtonGroup();
		JPanel myPanel2 = new JPanel();
		ArrayList<JRadioButton> masRB = new ArrayList <JRadioButton>();
		myPanel2.setLayout(new GridLayout(3,2));
		
		for (int i=0; i<6;i++) {
			masRB.add(new JRadioButton ("Выбор " +i));
			myGroup.add(masRB.get(i));
			myPanel2.add(masRB.get(i));
		}
		masRB.get(0).setSelected(true);
		fr.add(myPanel2,BorderLayout.EAST);
	}
	public static void setCenter (JFrame fr){
		fr.add(new JTextArea(), BorderLayout.CENTER);
	}
	public static void setSouth(JFrame fr){
		fr.add(new JTextArea(), BorderLayout.SOUTH);
	}
	
	
}
