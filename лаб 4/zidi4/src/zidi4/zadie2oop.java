package zidi4;

import javax.swing.JFrame;

public class zadie2oop {

	public static void main(String[] args) {
		
		
		 slon myslon = new slon();
		 myslon.mas = 5000;
		 myslon.podvod = false;
		 myslon.suhoput = true;
		 myslon.let = false;
		 myslon.skorost = 15;
		        
		        
		 orel myorel = new orel();
		 myorel.mas = 5;
		 myorel.podvod = false;
		 myorel.suhoput =true;
		 myorel.let = true;
		        
		
		        
		 okno myOkno = new okno();
		 myOkno.visota = 300;
		 myOkno.shirina = 200;
		 myOkno.pX = 10;
		 myOkno.pY = 20;
		 
		 
		        JFrame nf = new JFrame();
		        
		 nf.setBounds (20,10,300,200);
		 
		 nf.setVisible(true);
		
		
	}
	
	
	}

class givotn{
	
	int mas;
	
	boolean podvod;
	
	boolean suhoput;
	
	boolean let;
	
}

class slon extends givotn{
	
	int skorost;
	
}
class orel extends givotn{
	
	int visota;
	
}
class okno{
	
	int shirina;
	
	int visota;
	
	int pX;
	
	int pY;
	
}
