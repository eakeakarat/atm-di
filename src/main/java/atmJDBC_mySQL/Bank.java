package atmJDBC_mySQL;

import java.io.IOException;
import java.util.List;

/**
 * A bank contains customers with bank accounts.
 */
public class Bank {

    private List<Customer> customers;
    private Connectable source;

    /**
     * Constructs a bank with no customers.
     */
    public Bank(Connectable source) {
        this.source = source;
    }

    public void initializeCustomers() throws IOException {
        customers = source.readCustomers();
    }

    /**
     * Adds a customer to the bank.
     *
     * @param c the customer to add
     */
    public void addCustomer(Customer c) {
        customers.add(c.getCustomerNumber(), c);
    }

    /**
     * Finds a customer in the bank.
     *
     * @param number a customer number
     * @return the matching customer, or null if no customer
     * matches
     */
    public Customer findCustomer(int number) {
        for (Customer c : customers) {
            if (c.getCustomerNumber() == number) {
                return c;
            }
        }
        return null;
    }

    public void getCustomers() {
        for (Customer c :
                customers) {
            System.out.println(c.getCustomerNumber() + " ---- " + c.getPin());
        }
    }

    public void update(Customer customer){
        source.update(customer);
    }
}
