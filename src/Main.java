import Entities.Book;
import Entities.Library;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.getId();
        book.Name = "Echoes of Eternity";
        book.Author = "Amanda Sterling";
        book.Language = "English";
        book.Price = 19;
        book.Count=150;


        Book book2 = new Book();
        book2.getId();
        book2.Name = "Whispers in the Wind";
        book2.Author = "Michaela Rivers";
        book2.Language = "French";
        book2.Price = 24;
        book2.Count=200;

        Library library = new Library();
        library.addBook(book);
        library.addBook(book2);
        library.showBooks();

    }
    }
