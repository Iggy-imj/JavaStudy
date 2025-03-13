package homeworks.hw_25;

public class ImmutablePointApp {
    public static void main(String[] args) {

        ImmutablePoint point = new ImmutablePoint(4,8);

        System.out.println(point);

        point = new ImmutablePoint(5,12); // получается создалась новая ссылка

        System.out.println(point);

        // не можем присвоить другие значения
    //    point.x = 10;
    //    point.y = 20;

    //    Поля x и y объявлены с модификатором final, что делает их неизменяемыми после инициализации.
    //    Конструктор инициализирует значения x и y, и после этого их нельзя изменить.
    }
}
