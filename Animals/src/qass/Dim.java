package qass;

public class Dim {
    public static void main(String[] args) {
        Vet veterinarian = new Vet();
        Animalia[] animals = new Animalia[3];
        animals[0] = new Dog("���� � �����", "���� �������� ����");
        animals[1] = new Cat("������ � ����", "��������");
        animals[2] = new hors("����", "���������");

        for (Animalia animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}