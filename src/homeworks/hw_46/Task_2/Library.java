package homeworks.hw_46.Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public Optional<Book> findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
