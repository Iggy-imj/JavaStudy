package hw_23;

import java.util.Arrays;

public class MagicApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Tomas", 30, 5000);

        employee.info();

        //
        employee.setAge(150);
        employee.setSalary(-400);

        employee.info();

        //
        employee.setAge(35);
        employee.setSalary(6600);

        employee.info();


        // ----------------------------

        System.out.println("\n=== MagicArrayEncaps ===\n");
        MagicArrayEncaps magicArray = new MagicArrayEncaps();
        magicArray.add(10);
        magicArray.add(20);
        magicArray.add(30);

        System.out.println("Magic Array: " + magicArray);
        System.out.println("Size: " + magicArray.getCursor());
        System.out.println("Array to String: " + Arrays.toString(magicArray.getArray()));

        System.out.println("Array using toArray: " + Arrays.toString(magicArray.toArray()));

        magicArray.setArray(new int[]{1, 2, 3, 4, 5});
        System.out.println("After setArray: " + magicArray);
    }
}
