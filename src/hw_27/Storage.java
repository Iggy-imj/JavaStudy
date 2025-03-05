package hw_27;

public class Storage extends Component {

    private int capacity;

    public Storage(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public String toString() {
        return super.toString() + String.format(", capacity: %dGb}", capacity);
    }
}
