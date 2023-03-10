import java.util.ArrayList;
import java.util.List;

public class Customer {

    //comment

    int customerId;
    String firstName;
    String lastName;
    String email;
    int phone;
    Cart cart;


    public Customer(int customerId, String firstName, String lastName, String email, int phone) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        cart = null;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "--- Customer Info --- \nFirst name: "+firstName+"\nLast name: "+lastName+"\nPhone number: "+phone+"\nE-mail: "+email;
    }
}
