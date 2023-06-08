package zadka4;

import javax.swing.JFrame;

public class zadie4 {

	public static void main(String[] args) {
		
		tiger mytiger = new tiger();
		
		mytiger.mas = 150;
	
		mytiger.skorost = 70;
		
		mytiger.podvod = false;
		
		mytiger.suhoput = true;
		
		mytiger.fly = false;
		
		orel myorel = new orel();
		
		myorel.fly = true;
		
		myorel.mas = 4;
		
		myorel.podvod = false;
		
		myorel.suhoput = true;
		
		myorel.visota = 90;
		
		okno myokno = new okno();
				myokno.shirina = 300;
		myokno.visota = 200;
		myokno.pX = 10;
		myokno.pY = 20;
		
		 JFrame nf = new JFrame();
		 nf.setBounds (20,10,300,200);
		 nf.setVisible(true);
                  

	}

}
class givotn{
	
	int mas;
	
	boolean podvod;
	
	boolean suhoput;
	
	boolean fly;
	
}

class tiger extends givotn{
	
	int skorost = 70;
	
}
	class orel extends givotn{
		
		int visota = 90;
		
	}
	class okno {
		
		int shirina;
		
		int visota;
		
		int pX;
		
		int pY;
		
	}
	
	
	
	
	
	
