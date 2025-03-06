package lesson_28.animals;

public class Dog extends Animal {

    @Override
    public void voice() {
        //
        super.voice();
    }

    @Override
    public String toString() {
        return super.toString() + "| DOG. Дополнение реализации родительского метода";
    }
}
