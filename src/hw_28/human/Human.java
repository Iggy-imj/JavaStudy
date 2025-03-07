package hw_28.human;

public class Human {
    protected int speed;
    protected int restTime;

    public Human(int speed, int restTime) {
        this.speed = speed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(getClass().getSimpleName() + "бежит со скоростью " + speed + " км/ч");
        rest();
    }

    public void rest() {
        System.out.println("Отдыхает " + restTime + " минут");
    }
}