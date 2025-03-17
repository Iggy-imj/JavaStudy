package lessons.lesson_35.equals;

import java.util.Objects;

public class Employee {
    private String firstName, lastName, dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    // Прописываю логику сравнения этого обьекта с другим обьектом любого типа данных
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // перемпенные ссылаются на один и тот же обьект
//
//        if (!(obj instanceof Employee)) return false; // Проверка на возможность привести к Employee
//        Employee employee = (Employee) obj;
//
//        // Сравнение значений полей. Которые должны быть равными для признания объектов равными

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(dateOfBirth);
        return result;
    }

    ////        return  firstName.equals(employee.firstName) && lastName.equals(employee.lastName) &&
////                dateOfBirth.equals(employee.dateOfBirth);
//
//        // Безопасное сравнение обьектов с учетом возможнотси появления null - значений
//
//        return Objects.equals(firstName, employee.firstName) &&
//                Objects.equals(lastName, employee.lastName) &&
//                Objects.equals(dateOfBirth, employee.dateOfBirth);
//
//    }





    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
