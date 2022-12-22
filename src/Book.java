public class Book {

    int bookId;
    String title;
    String author;
    int price;

    public Book(int bookId, String title, String author, int price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void printBook(){
        System.out.println("Book ID : " + bookId);
        System.out.println("Book title : " + title);
        System.out.println("Book author : " + author);
        System.out.println("Book price : € " + price);
    }
}
