package zxs4;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class zcv4 {

	public static void main(String[] args) {
	    myFrame okno = new myFrame();
		
	}

}
 
class myFrame extends JFrame{
	
    myFrame()
    
    {
        myPanel pn = new myPanel();
        Container cont = getContentPane();
        cont.add(pn);
        setBounds(10, 10, 300, 600); 
        setVisible(true);   
    }

}

    class myPanel extends JPanel{
    	public void paintComponent(Graphics gr)
        {
            gr.setColor(Color.GREEN);
            gr.fillRect(10, 10, 200, 300);
        }
    }
    