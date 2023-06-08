
public class z1 {

	public static void main(String[] args) {
		 int a=0;
	        for(int i=1;i<=99;i++){
	            if(i%2!=0)a++;
	        }
	      
	        int[] dan = new int[a];
	        for(int i=1,b=0;i<=99;i++){
	                if(i%2!=0){
	                    dan[b]=i;
	                    System.out.print(dan[b]+" ");
	                    b++;
	                }
	        }
	        
	        System.out.println(" ");
	        for(int i=dan.length-1;i>=0;i--){
	            System.out.println(dan[i]);
	        }

	}

}
