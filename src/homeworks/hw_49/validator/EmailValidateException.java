package homeworks.hw_49.validator;


//extends RuntimeException = для НЕ-проверяемых исключений
//extends Exception = для проверяемых исключений
public class EmailValidateException extends Exception{

    /*
    getMessage() -  возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() -  строковое исключение
    printStackTrace() - выводит трассировку исключения
    */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }
}
