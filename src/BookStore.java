import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;
    private List<Customer> customers;

    public BookStore(){
        books = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void createNewCustomer(int customerId, String firstName, String lastName, String email, int phone){
        customers.add(new Customer(customerId, firstName, lastName, email, phone));
    }
    private void generateBooks() {
        books.add(new Book(1,"Java for noobs","Smart Ass",250));
        books.add(new Book(2,"Wise book","Old person",25));
        books.add(new Book(3,"Fun stuff","Silly dude",50));
        books.add(new Book(4,"Emotional stuff","Deep person",75));
    }
    private void generateCustomers() {
        customers.add(new Customer(1,"Rune","Hellden","rune@mail.dk",12345678));
        customers.add(new Customer(2,"Aliaksandr","Sanin","aliaksandr@mail.dk",23456789));
        customers.add(new Customer(3,"Lisa","Watts","lisa@mail.dk",34567890));
        customers.add(new Customer(4,"Nicolaj","Jensen","nicolaj@mail.dk",45678901));
    }
    private void addNewCartForCustomer() {
        List<>
    }

}
