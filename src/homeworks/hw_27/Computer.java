package homeworks.hw_27;

public class Computer {
    private final Processor processor;
    private final Memory memory;
    private Storage storage;

    public Computer(String cpuBrand, String cpuModel, double frequency,
                    String ramBrand, String ramModel, int size,
                    Storage storage) {
        this.processor = new Processor(cpuBrand, cpuModel, frequency);
        this.memory = new Memory(ramBrand, ramModel, size);
        this.storage = storage;
    }

    public String toString() {
        return String.format("Computer: \n %s, \n %s,\n %s\n", processor, memory, storage);
    }
}
