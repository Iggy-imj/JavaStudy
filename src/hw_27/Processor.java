package hw_27;

public class Processor extends Component {

    private double frequency;

    public Processor(String brand, String model, double frequency) {
        super(brand, model);
        this.frequency = frequency;
    }

    public String toString() {
        return super.toString() + String.format(", frequency: %.2f GHz}", frequency);
    }


}
