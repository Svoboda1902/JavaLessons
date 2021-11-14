import java.util.ArrayList;

public class Box<T extends Fruit> { //T extends Fruit - положить в коробки можно только наследников


    ArrayList<T> box = new ArrayList<>();

    public void addFruitsInBox(T t) {
        box.add(t);
    }

    public float getWeight() {
        float sum = 0.0f;
        for (T t : box) {
            sum = sum + t.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> another) {
        return getWeight() == another.getWeight();
    }

    public void boxShift(Box<T> another) {
        for (T t : box) {
            another.addFruitsInBox(t);
        }
        this.box.clear(); //очистка коробки
    }
}
