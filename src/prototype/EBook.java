package prototype;

import java.util.List;

public class EBook extends Book {

    private final List<String> availablePlatforms;

    public EBook(int id, String bookName, List<String> availablePlatforms) {
        super(id, bookName);
        this.availablePlatforms = availablePlatforms;
    }

    public EBook(EBook eBook) {
        super(eBook);
        this.availablePlatforms = eBook.availablePlatforms;
    }

    @Override
    public Book clone() {
        return new EBook(this) ;
    }
}
