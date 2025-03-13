package lessons.lesson_27;

/*
Ассоциация:
-> Агрегация:
    -> Композиция


Автобус имеет Водителя. HAS-A. Агрегация. Водитель может существовать отдельно от автобуса

Автобус содержит Автопилот. HAS-A. Композиция. Автопилот является неотьемлемой частью автобуса
Жесткая/неразрывная связь / Часть создается вместе с целым
 */

public class Autobus {

    private static int counter = 1;

    private final int id;

    private BusDriver driver;  // агрегация (мягкая связь)
    private Autopilot autopilot; // композиция (жесткая связь)

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

//    @Override
//    public String toString() {
//        return "Autobus {" +
//                "id=" + id +
//                ", driver=" + driver.toString() +
//                ", autopilot=" + autopilot.toString() +
//                ", capacity=" + capacity +
//                '}';
//    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus {");
        sb.append("id=").append(id)
                .append(", driver=").append(driver)
                .append(",autopilot=").append(autopilot)
                .append(", capacity=").append(capacity)
                .append("}");
        return sb.toString();
    }

    public void showListPassengers() {

        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers -1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takepassenger(Passenger passenger) {
        if (passenger == null) return false;
        /*
        1. Проверить свободное место
        2. Находится ли уже этот пассажир в нашем автобусе
        3. Если есть место и пассажир еще не автобусу - садим на борт:
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем список пассажиров
            3.3. Возвращаем Тру
        4. Иначе (3.3) - что-то пошло не так - выдаем сообщение об ошибке и возвращаем Фолс
         */

        if (countPassengers < capacity) {
            // место есть
            // надо проверить пункт 2
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n",
                        passenger.getId(), this.id);
                return false;
            }
            // Сажу на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобусе с id %d\n",
                    passenger.getId(), this.id);
            return true;
        }
        // Свободного места нет
        System.out.printf("В автобусе с id %d свободного места нет\n", this.id);
        return false;

    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        return false;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}
