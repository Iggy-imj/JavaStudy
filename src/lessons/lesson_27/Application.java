package lessons.lesson_27;

public class Application {
    public static void main(String[] args) {
        
        BusDriver busDriver = new BusDriver("John", "LN-23939348");
        
        Autobus bus = new Autobus(busDriver,15);

        System.out.println(bus.toString());

        //----

        BusDriver busDriver1 = new BusDriver("Margo", "AR-328774878");

        bus.setDriver(busDriver1);

        System.out.println(bus.toString());

        //----

        bus.showListPassengers();

        System.out.println("\n-----------------");

        Passenger john = new Passenger("John");
        Passenger mario = new Passenger("Mario");
        Passenger jane = new Passenger("Jane");

        System.out.println(jane.toString());
        System.out.println(john.toString());

        bus.takepassenger(john);
        bus.takepassenger(john);
        bus.takepassenger(mario);
        bus.takepassenger(jane);
        bus.takepassenger(jane);

        System.out.println("Количество пасс.: " + bus.getCountPassengers());

        bus.showListPassengers();

    }
    
    
}
