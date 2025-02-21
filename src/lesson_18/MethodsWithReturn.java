package lesson_18;

public class MethodsWithReturn {
    public static void main(String[] args) {

        // возвращаемое значение - это результат,
        // который метод отправляет обратно
        // вызывающему его(метод) коду после завершения

        //это способ передать результат вычислений метода в другие части программы

//      int sum = 10 + 5;
        calculateSum(10, 5);
        int sum = calculateSum(10, 5);

        sum = calculateSum(10, 5) + calculateSum(20, 30);



    }// Method area

    public static int calculateSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result; // - оператор заканяивающий работу метода и возвращающий значение


    }
}
