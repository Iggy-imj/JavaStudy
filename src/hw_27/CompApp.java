package hw_27;

public class CompApp {
    public static void main(String[] args) {
        Processor cpu = new Processor("Intel", "Core i7", 3.5);
        Memory ram = new Memory("Corsair", "Vengeance LPX", 32);
        Storage hdd = new Storage("Seagate", "Barracuda", 2000);

        Computer pc = new Computer(cpu, ram, hdd);
        System.out.println(pc);
    }
}
