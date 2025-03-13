package lessons.lesson_30.Flyable;

public abstract class Transport {
    int capacity, amountPassengers;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract boolean takePassenger();

    public int getCapacity() {
        return capacity;
    }
}
