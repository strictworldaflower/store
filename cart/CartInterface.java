package cart;

import java.util.ArrayList;
import item.Book;

public interface CartInterface {
    void printBookList(ArrayList<Book> p);

    boolean isCarInBook(String id);

    void insertBook(Book p);

    void removeCart(int numId);

    void deleteBook();
}
