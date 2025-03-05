package hw_27;

public class Memory extends Component {

    private int size;

    public Memory(String brand, String model, int size) {
        super(brand, model);
        this.size = size;
    }

    public String toString() {
        return super.toString() + String.format(", size: %dGb}", size);
    }
}
