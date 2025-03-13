package lessons.lesson_30.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book("Мастер и маргарита", "М.Булгаков");
        book.print();
        book.defaultMethod();


        Journal journal = new Journal("Cosmopolitan", 154);
        journal.print();
        journal.defaultMethod();

        Printable printable = journal;

        Printable printable2 = new Book("Философия Java", "Б. Эккель");
        printable2.print();

        Printable.testStaticMethod("Hello!");


        ColorPrintable presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP"
        );
        presentation.print();
        presentation.defaultMethod();
        presentation.colorPrint();
    }
}
