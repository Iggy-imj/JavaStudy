package hw_28.human;

public class ProAthlete extends AmateurAthlete{

    @Override
    public void run() {
        System.out.println("Я бегу со скоростью 25 км/ч");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Отдыхаю 5 минут");
    }
}
