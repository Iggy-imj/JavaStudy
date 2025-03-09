package lesson_29.children;

public class Child extends Parent {

    // Скопировано от родителя
    // private String name;
    int age;

    // елси нет ни родного конструкторо то будет доавлен вида


    public Child() {
        super();
    }
//    public Child() {
//        // Сначала я должен создать обьект родителя
//        super("Default");
//
//        this.age = 20;
//    }

}
