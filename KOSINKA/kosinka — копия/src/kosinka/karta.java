package kosinka;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class karta {
	
	public int x,y;
	
	public Image img;
	
	public boolean tipRubashka;
	
	public Image rubashka;
	
	public int mast;
	
	public int tipKarta;
	
	public boolean vibrana;
	
	public boolean red_karta;
	
	public karta(String path,Image rubashka,int nom) {
		
		vibrana = false;
	}
	public void draw(Graphics gr) {
		
		if(tipRubashka==false) {
			
			gr.drawImage(img, x, y, 72, 97, null);
		}
		else {
			gr.drawImage(rubashka, x, y, 72, 97, null);
		}
		if(vibrana==true) {
			gr.setColor(Color.YELLOW);
			gr.drawRect(x, y, 72, 97);
		}
		
	}
	

}
