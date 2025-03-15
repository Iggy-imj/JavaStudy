package homeworks.hw_34;

import homeworks.hw_33.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestPersonAgain {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "invalid@@test.com",
            "invalid.com",
            "invalid@com",
            "@invalid.com",
            "invalid@.com",
            "invalid@test..com",
            "invalid@com.",
            "invalid@test,com",
            "invalid@.test.com"
    })

    void testInvalidEmailSet(String invalidEmail){
        person.setEmail(invalidEmail);

        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Qwerty123!",
            "A1b2C3d4@",
            "P@ssw0rd99",
            "StrongP@ss!"
    })

    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);
        Assertions.assertEquals(validPassword, person.getPassword());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "short",
            "nouppercase1!",
            "UPERCASEALL1!",
            "NoNumbers!!",
            "NoSpecials123",
            "     ",
            "password",
            "12345678",
            "!!!!!!@@@@@"
    })
    void testInvalidPasswordSet(String invalidPassword) {
        person.setPassword(invalidPassword);

        Assertions.assertNotEquals(invalidPassword, person.getPassword());
        Assertions.assertEquals(startPassword, person.getPassword());
    }




}
