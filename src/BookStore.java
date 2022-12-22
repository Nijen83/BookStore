import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {
    private List<Book> books;
    private List<Customer> customers;
    private Cart cart;
    private Customer choosenCustomer = null;
    private Scanner sc = new Scanner(System.in);

    public BookStore(){
        books = new ArrayList<>();
        customers = new ArrayList<>();
        generateBooks();
        generateCustomers();
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

    }

    private void addCustomer(){
        System.out.println("--- Add New Customer ---");
        System.out.print("First name: ");
        String firstName = sc.nextLine();
        System.out.print("Last name: ");
        String lastName = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Phone number: ");
        int phone = sc.nextInt();
        sc.nextLine();
        System.out.println();
        int customerId = 0;

        for(Customer customer : customers){
            if(customer.getCustomerId() > customerId){
                customerId = customer.getCustomerId();
            }
        }
        customerId++;
        customers.add(new Customer(customerId,firstName,lastName,email,phone));

        System.out.println("Customer Added!");
        System.out.println("---------------------");
        options();
    }

    public void chooseCustomer(){
        System.out.println("--- Choose Customer ---");
        for(Customer customer : customers){
            System.out.println(customer.getCustomerId()+". "+customer.getFirstName()+" "+customer.getLastName());
        }
        int option = sc.nextInt();
        sc.nextLine();

        for(Customer customer : customers){
            if(option == customer.getCustomerId()){
                choosenCustomer = customer;
                break;
            }
        }
        System.out.println();
        System.out.println("You choose: "+choosenCustomer.getFirstName()+" "+choosenCustomer.getLastName());
        System.out.println("---------------------");
        options();
    }

    private void addBookToCustomerCart(){
        System.out.println("--- Choose Book ---");
        for(Book book : books){
            System.out.println();
            book.printBook();
        }
        System.out.println();
        System.out.print("Choose book by id:");
        int option = sc.nextInt();
        sc.nextLine();

        for(Book book : books){
            if(option == book.getBookId()){
                choosenCustomer.cart.add(book);
                System.out.println("Book added to cart!");
                break;
            }
        }
        System.out.println();
        System.out.print("Add more books to cart? (y/n): ");
        String answer = sc.nextLine();
        if(answer.equals("y")){
            addBookToCustomerCart();
            System.out.println("---------------------");
        }else{
            options();
            System.out.println("---------------------");
        }
    }

    private void removeBookFromCustomerCart(){
        System.out.println("--- Choose Book ---");
        for(Book book : choosenCustomer.cart.getListOfItems()){
            System.out.println();
            book.printBook();
        }
        System.out.println();
        System.out.print("Choose book by id:");
        int option = sc.nextInt();
        sc.nextLine();

        for(Book book : choosenCustomer.cart.getListOfItems()){
            if(option == book.getBookId()){
                choosenCustomer.cart.remove(book);
                System.out.println("Book removed from cart!");
                System.out.println("---------------------");
                break;
            }
        }
    }

    private void viewCustomerCart(){
        System.out.println("--- Books in cart ---");
        for(Book book : choosenCustomer.cart.getListOfItems()){
            System.out.println();
            book.printBook();
        }
        System.out.println();
        System.out.println("Press enter to go back...");
        sc.nextLine();
        System.out.println("---------------------");
        options();
    }

    public void options(){
        System.out.println("--- Options ---");
        System.out.println("1. Add Customer");
        System.out.println("2. Choose Customer");
        System.out.println("3. Add Books To Cart");
        System.out.println("4. Remove Book From Cart");
        System.out.println("5. View Cart");
        System.out.println("6. Exit Book Store");
        int option = sc.nextInt();
        sc.nextLine();

        switch (option){
            case 1:
                addCustomer();
                break;
            case 2:
                chooseCustomer();
                break;
            case 3:
                addBookToCustomerCart();
                break;
            case 4:
                removeBookFromCustomerCart();
                break;
            case 5:
                viewCustomerCart();
                break;
            case 6:
                System.out.println("Walking out of bookstore");
                System.exit(0);
        }
    }

//    public void removeCustomer(){
//        System.out.println("--- Remove Customer ---");
//        for(Customer customer : customers){
//            System.out.println(customer.getCustomerId()+". "+customer.getFirstName()+" "+customer.getLastName());
//        }
//        int option = sc.nextInt();
//        sc.nextLine();
//        System.out.println();
//        for(Customer customer : customers){
//            if(customer.getCustomerId() == option){
//                customers.remove(customer);
//                break;
//            }
//        }
//        System.out.println("You removed customer with CustomerId: "+option);
//    }
}
