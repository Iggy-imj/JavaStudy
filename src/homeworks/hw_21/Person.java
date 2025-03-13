package homeworks.hw_21;

public class Person {
    String name;
    String jobTitle;
    int age;
    int experience;

    public Person(String name, String jobTitle, int age, int experience) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.experience = experience;
    }
    void info() {
        System.out.printf("\nHi. My name is %s, I am %d years old, " +
                "I work as a %s and I have %d years of experience.", name, age, jobTitle, experience);
    }
}
