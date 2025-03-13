package lessons.lesson_31.generics;

import lessons.lesson_28.animals.Cat;

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hello");

        String value = box.getValue();
        System.out.println(value.toUpperCase());
        System.out.println(box.getValue().length());

        box.setValue("NEw Value");

        System.out.println(box);

        GenericBox<Cat> catBox = new GenericBox<>(new Cat());

        System.out.println(catBox.getValue());




        //

        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);
        System.out.println(intBox);

        int sum = intBox.getValue() + intBox2.getValue();

        System.out.println(sum);

        int val = intBox.getValue();




    }
}
