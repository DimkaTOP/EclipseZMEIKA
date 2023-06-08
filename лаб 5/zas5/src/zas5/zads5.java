package zas5;

import javax.swing.JFrame;

public class zads5 {

	public static void main(String[] args) {
		
		givotn slon = new givotn();
		slon.massa = 5000;
		slon.est();
		System.out.print(slon.massa);
		
				
		
	}

}

class givotn{
	int massa;
	void est(){
		massa = massa+1;
	}
}
class myFrame extends JFrame{
	public myFrame() {
		setBounds(10,10,800,600);
		setVisible(true);
	}
}