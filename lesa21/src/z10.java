import java.util.Scanner;
public class z10 {

	public static void main(String[] args) {
		int a,lCount=0,rCount=0;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        
        if (scn.hasNextInt()){
           
            do{
                a=scn.nextInt();
                if(a%2!=0||a<1)System.out.println("�� ��������, ������� �������� ������ �����!");
            }
            while(a%2!=0||a<1);
            
            int[] Mas = new int[a];
            for(int i=0;i<Mas.length;i++){
                Mas[i]=(int)(Math.random()*11)-5;
                    System.out.print(Mas[i]+" ");
                    
                if(i<=Mas.length/2-1){
                    lCount+=Math.abs(Mas[i]);
                }
                else {
                    rCount+=Math.abs(Mas[i]);
                }
             
                if(i==Mas.length-1){
                    System.out.println(" ");
                    if(lCount>rCount)
                        System.out.println("����� ������� ������ �������� ������� ������ � ����� "+lCount);
                    if(rCount>lCount)
                        System.out.println("����� ������� ������ �������� ������� ������ � ����� "+rCount);
                    if(rCount==lCount)
                        System.out.println("����� ������� ������ � ������ �������� ����� "); 
                }
            }
        }
        else System.out.println("������� �� ����� ");
    }
}
