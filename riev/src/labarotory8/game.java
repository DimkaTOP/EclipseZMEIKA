package labarotory8;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class game {
	

	public static void main(String[] args) {

		String rez = JOptionPane.showInputDialog(null,"Enter the difficulty of the game from 1 to 7: ","Difficulty of the game",1);
		
		int slogn = rez.charAt(0)-'0';
		
		 if ((slogn>=1)&&(slogn<=7)) {
			 
            okno window = new okno(slogn);
            
         }
		 
	}
	
}

		 