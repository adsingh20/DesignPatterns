package Runner;

import prototype.Book;
import prototype.BookShop;

import java.util.stream.Collectors;

public class Runner {
     public static void main(String[] args) throws CloneNotSupportedException{
          createPrototype();
     }

     private static void createPrototype() throws CloneNotSupportedException{
          BookShop bookShop1 = new BookShop();
          bookShop1.setBookShopName("Amazon");
          bookShop1.loadEBooks();

          BookShop bookShop2 = bookShop1.clone();
          bookShop2.setBookShopName("Wannabe Amazon");

          BookShop bookShop3 = new BookShop();
          bookShop3.setBookShopName("Flipkart");
          bookShop3.setBooks(bookShop1.getBooks().stream().
                  map(Book::clone).collect(Collectors.toUnmodifiableList()));

     }
}
