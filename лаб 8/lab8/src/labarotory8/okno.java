package labarotory8;


import java.awt.Container;

import javax.swing.JFrame;


 
	

public class okno extends JFrame{

	public okno() {
		
		pole gameP = new pole();
		
		Container con = getContentPane();
		
		con.add(gameP);
		
		setTitle("GAME: NEWYEAR RAIM");
		
		setBounds(0,0,800,600);
		
		setFocusable(true);
		
		setVisible(true);
		
	}
}
