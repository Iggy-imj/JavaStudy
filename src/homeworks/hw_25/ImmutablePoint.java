package homeworks.hw_25;

public class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Попытка создать сеттеры
//    public void setX(int x) {
//    this.x = x;
//    }
//
//    public void setY(int y) {
//    this.y = y;
//    }
    //Сеттеры не могут быть созданы, так как final переменные можно присвоить только один раз.
    //    Поля x и y объявлены с модификатором final, что делает их неизменяемыми после инициализации.
    //    Конструктор инициализирует значения x и y, и после этого их нельзя изменить.

    public String toString() {
        return "ImmutablePoint{" + "x=" + x + ", y=" + y + '}';
    }


}
