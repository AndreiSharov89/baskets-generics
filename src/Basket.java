import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    private final List<T> basketOfFruits;

    public Basket() {
        basketOfFruits = new ArrayList<>();
    }

    void add(T fruit) {
        basketOfFruits.add(fruit);
    }

    double getWeight() {
        double weightOfBasket = 0;
        for (T fruit : basketOfFruits) {
            weightOfBasket += fruit.getWeight();
        }
        return weightOfBasket;
    }

    int compare(Basket<? extends Fruit> another) {
        if (getWeight() > another.getWeight()) {
            return 1;
        } else if (getWeight() < another.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }

    static <U extends Fruit> void transfer(Basket<? extends U> first, Basket<? super U> second) {
        second.basketOfFruits.addAll(first.basketOfFruits);
        first.basketOfFruits.clear();
    }
}
