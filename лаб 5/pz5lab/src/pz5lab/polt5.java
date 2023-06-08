package pz5lab;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class polt5 {

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
				gr.setColor(Color.BLUE);
				for(int i=0; i<10; i++) {
					gr.fillRect(10*i, 10*i, 50*i, 50*i);				}
			}
		}



	


