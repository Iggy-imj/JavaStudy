package lessons.lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(10, "Peter", 25));
        users.add(new User(5, "Max", 18));
    }

    public static void main(String[] args) {

        // Optional<T>

        Optional<User> optUser = getById2(10);


        // boolean isPresent() Мы можем проверить есть ли в обвертке значение
        if (optUser.isPresent()) {
            // метод get() - позволяет получить значение завернутое в Optional
            // если вызвать его на пустом - получим NPE
            User user = optUser.get();
            System.out.println("User: " + user);
            System.out.println("Name: " + user.getName());
        } else {
            System.out.println("user not found");
        }

        // boolean isEmpty

        // orElse(T defaultValue) - распакует из опшинал обьект елси он есть или вернет значение по умолчанию
        User current = getById(10).orElse(null);
        System.out.println("getById(1).orElse(null): " + current);


        // NPE
       // System.out.println(user.getName());






    }

    // Как создать Optional 3 способа

    // 1-  Optional.of(value) - создает  Optional содержащий значение (не пустой)
    // если попытаться передать ноль - будет ошибка

    // 2- Optional.empty() - создает пустой

    // 3- Optional.ofNullable(value) - который содержит значение или пустой


    //
    public static Optional<User> getById(int id) {
        //
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }

    public static Optional<User> getById2(int id) {
        //
        User result = null;
        for (User user : users) {
            if (user.getId() == id) {
                result = user;
            }
        }

        return Optional.ofNullable(result);
    }

}
