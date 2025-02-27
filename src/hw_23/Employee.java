package hw_23;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void info() {
        System.out.printf("Employee: %s, Age: %d, Salary: %.2f\n", name, age, salary);
        // String result = String.format("Employee: %s, Age: %d, Salary: %.2f\n", name, age, salary);
    }
}
