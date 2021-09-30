package Lesson11;

import java.util.Arrays;
import java.util.List;

public class HomeWork11 {
    public static void main(String[] args) {
        String[] arr = {
                "cat", "dog", "mouse",
                "elephant", "bull", "giraffe",
                "elephant"
        };

        arrayToArrayList(arr);

        switchArraysElements(arr, 2, 0);

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.getWeight();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.getWeight();

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        appleBox.mixFruitBox(appleBox1);
        appleBox.getWeight();
    }

    //region метод задачи 1
    private static <Q> void switchArraysElements(Q[] array, int firstElement, int secondElement) {
        Q buffer = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = buffer;
        System.out.println(Arrays.toString(array));
    }
    //endregion

    //region метод задачи 2
    private static <Q> void arrayToArrayList(Q[] array) {
        List<Q> list;
        System.out.println(Arrays.asList(array));
    }
    //endregion
}

