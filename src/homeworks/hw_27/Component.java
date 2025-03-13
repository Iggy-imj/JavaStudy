package homeworks.hw_27;

public class Component {
    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return String.format("%s {brand: %s, model: %s", this.getClass().getSimpleName(), brand, model);
    }


}
