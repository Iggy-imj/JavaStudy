package homeworks.hw_33.person;

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email))
            this.email = email;
    }

    // проверка почты
    private boolean isEmailValid(String email) {

        //1. проверка на @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        //2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        //3. после последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) return false;

        //4. Алфавит, цыфры, символы: - , _ , @ , .
        // перебираю символы, если хоть один не подходящий - возвращаю фолс
        for (char ch : email.toCharArray()) {
            // проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';
            if (!isPass) return false; // делай что-то если переменная фолс
        }

        // 5. до собаки хотя бы один символ. индекс собаки не равен 0
        if (indexAt == 0) return false;

        //6. типа первый символ буква. но это не обязательно
        if (!Character.isLetter(email.charAt(0))) return false;


        return true;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password: " + password);
        }


        /* TODO
        Требования к паролю:
        1. Длина пароля >= 8
        2. Должна быть мин 1 цифра
        3. минимум одна буква - Character.isLowerCase()
        4. минимум одна большая буква
        5. минимум один спец. символ ! % $ @ & * () [] , . -

        Пароль должен удовлетворять всем требованиям сразу
        5 boolean переменных. Каждая отвечает за свой пункт.
        Пароль будет подходить только если все 5 имеют тру
         */
    }

    private boolean isPasswordValid(String password) {
        if (password.length() < 8) return false;

        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        String specialChars = "!%$@&*()[],.-";

        for (char ch : password.toCharArray()) {
            hasDigit = hasDigit || Character.isDigit(ch);
            hasLower = hasLower || Character.isLowerCase(ch);
            hasUpper = hasUpper || Character.isUpperCase(ch);
            hasSpecial = hasSpecial || specialChars.contains(String.valueOf(ch));
        }
        return hasDigit && hasLower && hasUpper && hasSpecial;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
