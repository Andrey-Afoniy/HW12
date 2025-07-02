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
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
