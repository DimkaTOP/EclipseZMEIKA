import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("����");
        list.add("���");
        list.add("���");
        list.add("������");
        list.add("����");

        
        System.out.println("����� ArrayList � ������� ����� for:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        
        System.out.println("\n����� ArrayList � ������� ����� while:");
        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        
        System.out.println("\n����� ArrayList � ������� ����������� ����� for:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}