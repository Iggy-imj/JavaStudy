package homeworks.hw_28.human;

public class SportApp {
    public static void main(String[] args) {
        Human person = new Human(10,15);
        AmateurAthlete amateur = new AmateurAthlete();
        ProAthlete pro = new ProAthlete();

        System.out.println("Обычный человек: ");
        person.run();

        System.out.println("\nЛюбитель: ");
        amateur.run();

        System.out.println("\nПрофессионал: ");
        pro.run();
    }
}
