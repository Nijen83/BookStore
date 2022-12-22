import java.util.ArrayList;
import java.util.List;

public class Cart {
    int orderId;
    List<Book> listOfItems;

    public Cart(int orderId){
        this.orderId = orderId;
        listOfItems = new ArrayList<>();
    }

    public void add(Book book){
        listOfItems.add(book);
    }

    public void remove(Book book){
        listOfItems.remove(book);
    }

    public void displayCart(){
        System.out.println("--- Order list of items ---");
        for(Book book : listOfItems){
            book.printBook();
        }
    }
}
