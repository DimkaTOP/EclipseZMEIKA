package zfx5z;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class zxg5 {

	public static void main(String[] args) {
		myFrame okno = new myFrame();
	}

}
class myFrame extends JFrame{
	public myFrame()
	{
		myPanel np = new myPanel();
				Container cont = getContentPane();
				cont.add(np);
				setBounds(10,10,800,600);
				setVisible(true);		
	}
}
class myPanel extends JPanel{
	public void paintComponent(Graphics gr) {
		gr.setColor(Color.RED);
		gr.fillOval(100, 100, 500, 500);
		gr.drawRect(10, 10, 300, 400);
	}
}

