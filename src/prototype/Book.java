package prototype;

public abstract class Book {
    private int id;
    private String bookName;
    private String author;

    public Book(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public Book(Book literature) {
        this.id = literature.id;
        this.bookName = literature.bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract Book clone();

    @Override
    public String toString() {
        return "Literature{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
