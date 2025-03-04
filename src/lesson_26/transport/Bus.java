package lesson_26.transport;

// extends -  наследование. Bus наследуется от Vehicle.
// Smartphone is-a Vehicle -> НЕ верно. Применять наследование НЕЛЬЗЯ
// Bus is-a Vehicle -  верно. Можно применить наследование

public class Bus extends Vehicle{

    private int capacity;
    private int countPassengers;


//    public  Bus() {
//        // ключевое слово super - это обращение к родительскому классу
//        // super() - вызов конструктора родительского класса
//        super();
//    }

    public Bus(String model, int year, int capacity) {
        // нужно сначала создать обьект родителя
        // если в конструкторе потомке нет явного вызова конструктора родителя
        // то автоматически будет вызван пустой конструктор родителя
        super(model, year);  // вызов родительского конструктора, принимающего модель и год
        // вызов конструктора родителя должен быть первой строчкой исполняемого кода
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + model);
            return true;
        }
        // По сути и есть блок else -> попаду только если условие иф выало false
        System.out.printf("В автобусе %s больше мест нет. Сейчас %d пассажиров", model, countPassengers);
        return false;
    }

    // todo метод высадки пассажиров из автобуса
    public boolean dropPassenger(){
        // главное не уйти в минус
        return false;

    }
}
