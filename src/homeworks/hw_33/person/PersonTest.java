package homeworks.hw_33.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonTest {
    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUP() {
        person = new Person(startEmail, startPassword);
    }



    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test123@test.com.de"})
    void testValidEmailSet(String validEmail) {

        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());

    }





}
