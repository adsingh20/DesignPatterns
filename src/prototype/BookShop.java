package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String bookShopName;
    private List<Book> books = new ArrayList<>();

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {
        for (int i = 0; i < 10; i++) {
            books.add(new Book(i, "Harry Potter".concat(String.valueOf(i))));
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", books=" + books +
                '}';
    }

    // Shallow Cloning which means we have two references to the same object
    /*@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setBooks(this.getBooks());
        return bookShop;
    }

}
