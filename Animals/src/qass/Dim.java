package qass;

public class Dim {
    public static void main(String[] args) {
        Vet veterinarian = new Vet();
        Animalia[] animals = new Animalia[3];
        animals[0] = new Dog("Каша и кости", "Двор частного дома");
        animals[1] = new Cat("Молоко и рыба", "Квартира");
        animals[2] = new hors("Сено", "Конеферма");

        for (Animalia animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}