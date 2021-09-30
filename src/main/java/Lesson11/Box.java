package Lesson11;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> fruitList;
    private int totalWeight;
    private String fruitType;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        this.fruitList.add(fruit);
        this.totalWeight += fruit.getWeight();
        this.fruitType = fruit.getType();
    }

    public void getWeight() {
        System.out.println("Вес ящика с " + this.fruitType + " = " + this.totalWeight);
    }

    public boolean compare(Box<?> comparableBox) {
        if (comparableBox.totalWeight == this.totalWeight) {
            return true;
        }
        return false;
    }

    public void mixFruitBox(Box<T> mixedFromThisFruitBox) {
        if (this != mixedFromThisFruitBox) {
            this.fruitList.addAll(mixedFromThisFruitBox.fruitList);
            this.totalWeight += mixedFromThisFruitBox.totalWeight;
            mixedFromThisFruitBox.fruitList.clear();
            mixedFromThisFruitBox.totalWeight = 0;
        } else {
            System.out.println("Нельзя пересыпать фрукты в ту же самую корзину");
        }
    }
}
