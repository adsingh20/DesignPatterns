package Runner;

import prototype.BookShop;

public class Runner {
     public static void main(String args[]) throws CloneNotSupportedException{
          createPrototype();;
     }

     private static void createPrototype() throws CloneNotSupportedException{
          BookShop bookShop1 = new BookShop();
          bookShop1.setBookShopName("Amazon");
          bookShop1.loadBooks();

          BookShop bookShop2 = bookShop1.clone();
          bookShop2.setBookShopName("Wannabe Amazon");
     }
}
