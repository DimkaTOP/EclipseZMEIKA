package games;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class pole extends JPanel {
	
	private Image shapka; 
    private Image fon; 
    public int x = 400;
    public int summ=0;
    private Image end_game; 
    public Timer timerUpdate,timerDraw; 

     public pole()
     {
    	          
         try
         {
           shapka = ImageIO.read(new File("shapka.png"));
         }
         catch(IOException ex) {}

         try
         {
           fon = ImageIO.read(new File("fon.png"));
         }
         catch(IOException ex) {}

         try
         {
           end_game = ImageIO.read(new File("end_game.png"));
         }
         catch(IOException ex) {}        

        

         
         timerUpdate = new Timer(3000,new ActionListener() { 
        	 
              public void actionPerformed(ActionEvent e) {
            	  
                
              }
              
          });  
         
         timerUpdate.start();                
         
         timerDraw = new Timer(50,new ActionListener() {              
              public void actionPerformed(ActionEvent e) {
                 repaint(); 
              }
          });         
         timerDraw.start(); 
                                                                          
     }
         
     public void paintComponent(Graphics gr)
     {
         super.paintComponent(gr);
         gr.drawImage(fon, 0, 0, null); 
         gr.drawImage(shapka, x, 465, null); 
         String str=Integer.toString(summ);
          gr.setFont(new Font("Courier New", Font.ITALIC, 30));
          gr.setColor(Color.white);
          gr.drawString(str, 50, 50);
                      
                      }
     
                 }
                 
         
