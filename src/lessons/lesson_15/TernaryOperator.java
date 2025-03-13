package lessons.lesson_15;

public class TernaryOperator {
    public static void main(String[] args) {

        // Тернарный оператор - краткая форма записи оператора if-else,
        // которая позволяется присваивать значения
        // переменной в зависимости от условия

        // без

        int age = 20;
        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        } else {
            status = "Несоврешенноелетний";

        }

        System.out.println(status);

        // переменная = (условие) ? значение_если_Тру : значение_если_Фолс

        String result = (age >= 18) ? "Совершеннолетний" : "Несоврешенноелетний";
        System.out.println(result);


        //
        int x = -10;
        System.out.println("Значение в переменной x - " + ((x > 0) ? "положительное" : "отрицательное"));



    }
}
