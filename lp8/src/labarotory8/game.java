package labarotory8;

import javax.swing.JOptionPane;

public class game {
	
	private static okno window;

	public static void main(String[] args) {
		
		String rez = JOptionPane.showInputDialog(null,"������� ��������� ���� �� 1 �� 7:","��������� ����",1);
		
		int slogn = rez.charAt(0)-'0';
		
		 if ((slogn>=1)&&(slogn<=7))
			 
         {
			 
            setWindow(new okno(slogn));
            
         }
	}
		 
		 public static okno getWindow() {
			 
		        return getWindow();
		        
		    }
		 
		 public static void setWindow(okno window) {
			 
		        game.window = window;
		        
	}

}
