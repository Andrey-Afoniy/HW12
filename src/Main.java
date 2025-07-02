public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Джордж ", "Оруэлл");
        Book book1 = new Book("Война и Мир", author1, 1998);
        Book book2 = new Book("1984", author2, 1949);
        book1.setPublishingYear(2015);
        System.out.println("Книга: " + book1.getBookTitle() + ", автор: " + author1.getAuthorName() + " " + author1.getAuthorSurname() + ", год издания: " + book1.getPublishingYear());
        System.out.println("Книга: " + book2.getBookTitle() + ", автор: " + author2.getAuthorName() + " " + author2.getAuthorSurname() + ", год издания: " + book2.getPublishingYear());
        System.out.println("Книга 1: " + book1);
        System.out.println("Книга 2: " + book2);
        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1.hashCode(): " + book1.hashCode());
    }
}