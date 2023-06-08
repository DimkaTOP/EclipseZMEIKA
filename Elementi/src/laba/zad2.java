package laba;

public class zad2 {

	public static void main(String[] args) {
		int am=0,a0=0,a1=0;
        int[] Mas = new int[11];
        for(int i=0; i<Mas.length; i++){
            Mas[i]=(int)(Math.random()*3)-1;
            System.out.print(Mas[i]+" ");
            if(Mas[i]< 0)am++;
            if(Mas[i]==0)a0++;
            if(Mas[i]>0)a1++;
            if(i==Mas.length-1){
                if(am>a0&am>a1)
                    System.out.println("Чаще всего встречается -1");
                if(a0>am&a0>a1)
                    System.out.println("Чаще всего встречается 0");
                if(a1>am&a1>a0)
                    System.out.println("Чаще всего встречается 1");
            }
        }      
     }
}
