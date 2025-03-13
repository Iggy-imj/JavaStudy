package homeworks.hw_27;

public class CompApp {
    public static void main(String[] args) {
        Storage hdd = new Storage("Seagate", "Barracuda", 2000);

        Computer pc = new Computer("Intel", "Core i7", 3.5,
                "Corsair", "Vengeance LPX", 32,
                hdd);

        System.out.println(pc);
    }
}
