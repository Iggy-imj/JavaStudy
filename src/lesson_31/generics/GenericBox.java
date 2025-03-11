package lesson_31.generics;

// создаем универсальный класс и не указывает тип данных в котором он работает

public class GenericBox <T>{
    // <T> - означает что вместо Т при создании обьекта будет подставлне конкретный тип данных
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" + "value=" + value + '}';
    }
}
