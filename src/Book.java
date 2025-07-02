import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final Author authorName;
    private int publishingYear;

    public Book(String bookTitle, Author authorName, int publishingYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public Author getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return  bookTitle + " " + authorName +" " + publishingYear ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, authorName, publishingYear);
    }

    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
