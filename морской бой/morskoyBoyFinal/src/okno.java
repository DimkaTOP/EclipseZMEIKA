import java.awt.Container;

import javax.swing.JFrame;

public class okno extends JFrame{
	public okno() {
		pole pan = new pole();
		Container cont = getContentPane();
		cont.add(pan);
		setTitle("Game\"Morskoy boy\"");
		setBounds(0,0,900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

}
