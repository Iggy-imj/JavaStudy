package lessons.lesson_23;

public class Cat {
    private String name;
    private int age; // - снаружи пользователь не сможет менять и получать доступ к полю
    private int weight;
    protected boolean isProtected;
    boolean isDefault;

    public  Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Гетеры и сеттеры


    // Гетеры со слова get
    public int getAge() {
        return age;
    }

    public  int getWeight() {
        return weight;
    }

    public String getName() {
        return  name;
    }

    //Сеттеры со слова set
/*    public void setAge(int age) {
        if (age < 0 || age > 30) {
            // пусто. Возраст не подходит - ничего не делаю
        } else {
            this.age = age;
        }
    }
*/
    public void setAge(int age) {
        if (!(age < 0 || age > 30)) {
            // если age подходит
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        // имеем возможность проверить входящее значение
        if (weight < 0) {
            //   Если входяшее не устраивает я погу установить значение по умолчанию
            this.weight = 0;
            System.out.println("Текущий вес кота: " + this.weight);
            return; // работа метода прекращается
        }
        // Если вес не больше 50 кг - то делай блок кода 1. Иначе делай код 2
        if (!(weight > 50)) {
            // код 1
            this.weight = weight;
        }
    }
    // я не хочу давать возможность изменять имя коту после создания обьекта
    // поэтому в классе не пишу сеттер на имя
    /*
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    */

    void sayMeow() {
        System.out.println("Meow! " + name);
        testMethod();
    }

    // внутренний метод
    private void testMethod() {
        System.out.println("Test");
    }





    public String toString() {
        // System.out.printf("Cat %s, age: $d, weig");
        String result = String.format("Cat %s, age: %d, weight: %d", name, age,weight);
        return result;

    }

}
