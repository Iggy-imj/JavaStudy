package lesson_29;

/*
Обьекты могут принадлежать классу Х и при этом могут быть приведены к другому типу
если между классами есть связь наследования
Это называется кастингом(casting)
Два вида:
- восходящее преобразование (upcasting) - преобразование обьекта дочернего класса в тип родительского класса
- нисходящее преобразование (downcasting) - рпеобразование обьекта родительского класса обратно в тип дочернего класса
 */

import lesson_28.animals.Animal;
import lesson_28.animals.Cat;
import lesson_28.animals.Dog;
import lesson_28.animals.Hamster;

public class CastingExample2 {

    public static void main(String[] args) {

        // Восходяшее преобразование происходит автоматически
        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal

        /*
        !!! ВАЖНО !!!
        Тип ссылочной переменной определяет:
        - ссылки на обьекты каких типов могут храниться в этой переменной
        - список методов которые можно вызвать, обращаясь к этой переменой

        Ссылочная может хранить обьект своего класса или любого ребенка

        Какая реализация будет вызвана определяется типом обьекта который привязан по ссылке
         */

        animal.voice();

        Animal animal2 = new Hamster(); // неявное автоматическое преобразование к типу энимал

        // сейчас обьект на Hamster
        animal2.voice();


        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        //  TODO нисходящее преобразование

        int intX = 10;
        double doubleX = intX; // неявное / автоматичсеское
        System.out.println(doubleX);

        intX = (int) doubleX;

        Animal animalD = new Dog(); // Upcasting - восходящее преобразование, не явное

        Dog dog = (Dog) animalD; // Downcasting - явное, нисходящее преобразование

        dog.bark();

        Animal animalCat = new Cat();
        // нельзя так делать
//        Dog dog1 = (Dog) animalCat;
//        dog1.bark();

        for (int i=0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();
            // проверка для избежания ошибок перед Downcasting
            if (currentAnimal instanceof Cat) {
                System.out.println("В ячейке "+ i + " -> is a cat");

                Cat catLink = (Cat) currentAnimal;
                catLink.eat();
            }

            if (currentAnimal instanceof Dog) {
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark();
            }

            System.out.println("\n==========");
        }

    }
}
