package prototype;

public class PaperBook extends Book{

    private final int weight;
    private final boolean hardCoverAvailable;

    public PaperBook(int id,
                     String bookName,
                     int weight,
                     boolean hardCoverAvailable) {
        super(id, bookName);
        this.weight = weight;
        this.hardCoverAvailable = hardCoverAvailable;
    }

    public PaperBook(PaperBook paperBook) {
        super(paperBook);
        this.weight = paperBook.weight;
        this.hardCoverAvailable = paperBook.hardCoverAvailable;
    }

    @Override
    public Book clone() {
        return new PaperBook(this) ;
    }
}
