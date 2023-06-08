package games;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class okno extends JFrame{
	
	    private static final long serialVersionUID = 1L;
	    private pole gameP; 
	    private int slogn; 
	    
	    private class myKey implements KeyListener  
	    {
	           
	            public void keyPressed(KeyEvent e)
	            {
	               
	                int key_ = e.getKeyCode();
	                
	                
	                if (key_==27) System.exit(0);                               
	                
	                else if (key_==37)
	                {
	                   
	                    if (gameP.x-30>-48) gameP.x-=30;
	                    else gameP.x=752;
	                }
	                
	                else if (key_==39) 
	                {
	                                      
	                    if (gameP.x+30<752) gameP.x+=30;
	                    else gameP.x=-48;
	                }
	                
	            }
	            public void keyReleased(KeyEvent e) {}
	            public void keyTyped(KeyEvent e) {}
	       }                
	    
	    public okno()
	    {          
	        addKeyListener(new myKey());
	        
	        setFocusable(true);
	        
	        
	        setBounds(10,10,800,600);
	        
	        setTitle("Игра: Новогодний дождь");
	        
	        setResizable(false);
	        
	       
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	       
	        gameP = new pole();
	      
	        Container con = getContentPane();
	        con.add(gameP);
	        
	      
	        setVisible(true);
	    }
	    
	}

