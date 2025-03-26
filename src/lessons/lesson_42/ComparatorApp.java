package lessons.lesson_42;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = new int[]{9, 5, 1, 2, 4, 11, 0};


        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021, 250);

        printCars(cars);

        Arrays.sort(cars);

        // Интерфейс Comparable<T> (Сравнимый)
        // Интерфейс Comparator<T>

        printCars(cars);

        CarSpeedComparator speedComparator = new CarSpeedComparator();

        Arrays.sort(cars, speedComparator);
        printCars(cars);

        System.out.println("==========================================\n");
        Arrays.sort(cars, new CarModelComparator());

        printCars(cars);


        System.out.println("==========================================\n");
        // Анонимные классы

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getModel().compareTo(c2.getModel());
            }
        });

        printCars(cars);


        // отсортировать машины в обратном порядке

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c2.getYear() - c1.getYear();
            }
        });

        printCars(cars);

//        Arrays.sort(cars, new Comparator<Car>() {
//            @Override
//            public int compare(Car c1, Car c2) {
//                return (c1.getYear() - c2.getYear()) * (-1);
//            }
//        });
//
//        printCars(cars);

        System.out.println("==========================================\n");

        // сравнить машины по году выпуска в порядке возрастания
        // если год совпадет тогда сравнить по модели в порядке убывания

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare != 0) {
                    return yearCompare;
                }
                //годы машин равны
                // обратный порядок сортировки по модели
                return c2.getModel().compareTo(c1.getModel());
            }
        });

        printCars(cars);


        System.out.println("==========================================\n");
        // Функциональный интерфейс
        // Лямбда выражения
        // (parameters) -> expression;

        // сортировка по году в обратном порядку с использованием лямбда
        Arrays.sort(cars, (car1, car2) -> {
            return car2.getYear() - car1.getYear();
        });

        printCars(cars);

        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());
        printCars(cars);

        // отсортировать машины по максимальной скорости в порядке убывания
        // если скорость совпадает - отсортировать по году естественный порядок
        Comparator<Car> carComparator = (c1,c2) -> {
            //System.out.println(c1.getMaxSpeed() + " | " + c2.getMaxSpeed());
            int speedCompare = Integer.compare(c1.getMaxSpeed(),c2.getMaxSpeed());
            //System.out.println("c1 - c2: " + speedCompare);

            if (speedCompare == 0) {
                return Integer.compare(c1.getYear(),c2.getYear());
            }
            return speedCompare;
        };

        Arrays.sort(cars, carComparator);
        printCars(cars);


        // Comparator - имеет набор статических и дефолтных методов,
        // облегчающих написание сложных или составных компараторов

        // comparing -сортировать обьекты по ключу
        // Функция ключ - способ вытащить из обьекта то значение по которому мы хотим сравнивать два обьекта
        // .reversed()


        // Отсортировать машины по модели в естественном порядке
        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars, byModel);
        printCars(cars);

        // Ссылка на метод - сокращенная запись лямбда выражения
        Arrays.sort(cars, Comparator.comparing(Car::getModel));
        printCars(cars);

        // Спец версии метода для сравнения примитивов. Избегать автоупаковки/ распаковки
        Arrays.sort(cars, Comparator.comparing(Car::getYear));
        printCars(cars);

        // Отсортировать по году выпуска в порядке убывания
        // второй параметр метода Comparing
        // естественный порядок - naturalOrder() /  обратный порядок reverseOrder()
        // nullsFirst -  значения null будут признаны найменшими
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.naturalOrder()));
        printCars(cars);

        //cars[5] = new Car(null,2021,250);
        Arrays.sort(cars,Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        Arrays.sort(cars,Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.reverseOrder())));
        printCars(cars);


        System.out.println("==========================================\n");
        // Отсортировать по модели. Если модели равны, то отсортировать по убыванию года выпуска

        Arrays.sort(cars, Comparator.comparing(Car::getModel)
                .thenComparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);


        // отсортировать машины по году выпуска,
        // если год равен - отсортировать по модели в обратном порядке

        Arrays.sort(cars, Comparator.comparing(Car::getYear)
                .thenComparing(Car::getModel, Comparator.reverseOrder()));
        printCars(cars);

        //reversed()
        Arrays.sort(cars, Comparator.comparing(Car::getYear)
                .thenComparing(Car::getModel, Comparator.reverseOrder()).reversed());
        printCars(cars);

        // отсортировать машины по году в обратном порядке,
        // если год равен - отсортировать по максимальной скорости в прямом порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder())
                .thenComparing(Car::getMaxSpeed));
        printCars(cars);











    }







    public static void printCars(Car[] cars) {
        System.out.println("====================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("====================\n");
    }
}
