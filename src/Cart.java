import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int orderId;
    private List<Book> listOfItems;

    public Cart(int orderId){
        this.orderId = orderId;
        listOfItems = new ArrayList<>();
    }

    public List<Book> getListOfItems() {
        return listOfItems;
    }

    public void add(Book book){
        listOfItems.add(book);
    }

    public void remove(Book book){
        listOfItems.remove(book);
    }

    public void displayCart(){
        System.out.println("--- Order list of items ---");
        System.out.println("Order ID: "+orderId);
        for(Book book : listOfItems){
            book.printBook();
        }
    }
}
