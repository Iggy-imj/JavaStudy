package homeworks.hw_33.person;


import homeworks.hw_25.Calculator_v2;
import lessons.lesson_27.Autobus;
import lessons.lesson_27.BusDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    // метод помеченый такой аннотацией будет выполняться перед Каждым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");

    }

    /*
    @BeforeAll - метод выполняется один раз перед выполнением первого тестового метода
    @AfterEach - выполняется после каждого тестового метода
    @AfterAll - один раз после выполнения последнего
    @Disabled - тест отключен и выполняться не будет

     */
//    @BeforeAll
//    static void setUp2() {
//        System.out.println("Method BeforeAll");
//    }

    @Test
    public void testAddition() {
        System.out.println("Test addition");
        //int result = 2 + 3;
        double result = Calculator_v2.plus(2, 3);

        // реальное/фактическое значение в переменной result
        // Ожидаемое значение 5

        // методы проверки утверждений


        Assertions.assertEquals(5, result); // проверяет равны ли два значений - Тест будет пройден если два значения равны
        Assertions.assertNotEquals(0, result); // тест пройдет, если фактический результат НЕ совпавдет с нежидаемым результатом
        Assertions.assertTrue(result >= 4); //проверяет, что условие верно (условие возвращает тру)
        assertEquals(10, 5 + 5);
        assertFalse(result > 10);
        assertNull(null); // тест будет пройдетесли обьект равен null
        assertNotNull("String"); // проверяет что обьект не равен null

    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        // пройденый тест - метод в котором нет ни одного ни верного утверждения
        //  в том числе пусто (вообще без утверждений)

    }


    // Параметризованные тесты

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("Current value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testStatic(int value) {
        System.out.println("static value run: " + value);
        Autobus bus = new Autobus(new BusDriver("Test", "11111"), 10);
        System.out.println(bus);
    }

    // источник данных в формате CSV -
    // Источник данных файл CSV

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruits(String fruit) {
        System.out.println("Current value: " + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "kiwi", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("Current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -10, 0, 15);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(expected, result);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2,4,true),
                Arguments.of(3,9,true),
                Arguments.of(4,15,false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person person, String newEmail) {
        System.out.println("Current value: " + person);
        System.out.println("New email: " + newEmail);
    }
    static Stream<Arguments> testPersonData() {
        Person person = new Person("test@mail.com", "passwonb1723^^&*");
        return Stream.of(
                Arguments.of(person, "neknnjnnj#kmkmfkw.com"),
                Arguments.of(new Person("jnjncjnj.ckk", "password"), "pass.com")
        );
    }


}