package hw_21;

public class MainAvto {
    public static void main(String[] args) {

        Avto avto = new Avto("VW", "Golf GTD MK7", "Violet", "Diesel", 2.0, 180);
        avto.about();

        avto.breakDown();
        avto.drive();
        avto.repair();
        avto.drive();

    }
}
