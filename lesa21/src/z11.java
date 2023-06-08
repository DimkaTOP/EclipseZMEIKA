public class z11 {
	public static void main(String[] args){
	      
	        int a=0,b=0;
	        int[] Mas = new int[12];
	       
	        do{
	            for(int i=0;i<Mas.length;i++){
	                Mas[i]=(int)(Math.random()*21)-10;
	               
	                if(Mas[i]<0){
	                    a++;
	                }
	                if(Mas[i]>0){
	                    b++;
	                }
	                
	                if(Mas[i]==0){
	                    --i;
	                }
	             
	                if(i==Mas.length-1&a!=Mas.length/2){
	                    a=0;
	                    b=0;
	                }
	            }
	        }
	        while (a!=Mas.length/2&b!=Mas.length/2);
	        for(int i=0;i<Mas.length;i++){
	            System.out.print(Mas[i]+" ");
	        }
	    }
	} 
