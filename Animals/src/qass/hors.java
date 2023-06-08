package qass;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class hors extends Animalia implements Serializable {
    private double weight;

    public hors() {
    }

    public hors(String food, String location) {
        super(food, location);
    }

    public hors(String food, String location, double weight) {
        this(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("������ ���.");
    }

    @Override
    public String makeNoise() {
        return "���-��-��-��!!!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof hors)) return false;
        if (!super.equals(o)) return false;

        hors horse = (hors) o;

        return Double.compare(horse.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food: '" + getFood() + '\'' +
                ", location: '" + getLocation() + '\'' +
                ", weight = " + weight +
                '}';
    }

    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeObject(getFood());
            os.writeObject(getLocation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            this.setFood((String) is.readObject());
            this.setLocation((String) is.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}