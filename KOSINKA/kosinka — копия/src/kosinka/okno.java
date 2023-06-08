package kosinka;

import java.awt.Container;

import javax.swing.JFrame;

public class okno extends JFrame {
	
	public okno() {
		pole panel = new pole();
		
		Container cont = getContentPane();
		
		cont.add(panel);
		
		setTitle("Game\"Pasians-kosinka\"");
		
		setBounds(0,0,1000,700);
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
	}

}
