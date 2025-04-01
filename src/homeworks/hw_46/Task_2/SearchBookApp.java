package homeworks.hw_46.Task_2;

import java.util.Optional;

public class SearchBookApp {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Стивен Кинг", "Кладбище домашних животных"));
        library.addBook(new Book("Фантазм", "Мэри Флауэрс"));

        Optional<Book> found = library.findBookByTitle("кладбище домашних ");

        if (found.isPresent()) {
            Book book = found.get();
            System.out.println("Найдена книга: " + book.getTitle() + ". Автор: " + book.getAuthor());
        } else {
            System.out.println("Книга не найдена");
        }

        Optional<Book> notFound = library.findBookByTitle("Гарик Потер");

        notFound.ifPresentOrElse(
                book -> System.out.println("Найдена книга: " +  book.getTitle()),
                () -> System.out.println("Книга не найдена")
        );

    }
}
