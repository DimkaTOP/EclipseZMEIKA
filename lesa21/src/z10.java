import java.util.Scanner;
public class z10 {

	public static void main(String[] args) {
		int a,lCount=0,rCount=0;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите четное число: ");
        
        if (scn.hasNextInt()){
           
            do{
                a=scn.nextInt();
                if(a%2!=0||a<1)System.out.println("Вы ошиблись, введите повторно четное число!");
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
                        System.out.println("Сумма модулей первой половины массива больше и равна "+lCount);
                    if(rCount>lCount)
                        System.out.println("Сумма модулей второй половины массива больше и равна "+rCount);
                    if(rCount==lCount)
                        System.out.println("Суммы модулей первой и второй половины равны "); 
                }
            }
        }
        else System.out.println("Введено не число ");
    }
}
