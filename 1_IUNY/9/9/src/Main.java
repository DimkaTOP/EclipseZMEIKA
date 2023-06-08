import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");
        list.add("пять");

        
        System.out.println("Обход ArrayList с помощью цикла for:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        
        System.out.println("\nОбход ArrayList с помощью цикла while:");
        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        
        System.out.println("\nОбход ArrayList с помощью улучшенного цикла for:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}