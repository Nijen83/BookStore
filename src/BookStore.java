import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Cart> carts;
    private List<Book> books;
    private List<Customer> customers;

    public BookStore(){
        carts = new ArrayList<>();
        books = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void createNewCustomer(int customerId, String firstName, String lastName, String email, int phone){
        customers.add(new Customer(customerId, firstName, lastName, email, phone));
    }

}
