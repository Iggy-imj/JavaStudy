package lessons.lesson_35.equals;

public class EmployeeApp {
    public static void main(String[] args) {


        Employee employee = new Employee("Petro", "Petrov", "21.10.1987");
        Employee employee1 = new Employee("Petro", "Ivanov", "05.10.1987");
        Employee employee2 = new Employee("Ivan", "Ivanov", "21.10.1987");
        Employee employee3 = new Employee("Petro", "Petrov", "21.10.1987");

        Employee employeeDate = new Employee("Petro", "Petrov", "01.01.2015");



        // == - сравнивает ссылки
        System.out.println("employee == employee1: " + (employee == employee1));
        System.out.println("employee == employee3: " + (employee == employee3));

        // Метод equals - логическое сравнение обьектов по их содержимому (сравнение по значению)

        System.out.println("employee.equals(employee1): " + employee.equals(employee1));
        System.out.println("employee.equals(employee3): " + employee.equals(employee3)); // почему не тру

        System.out.println("employee.equals(employeeDate): " + employee.equals(employeeDate));

    }
}
