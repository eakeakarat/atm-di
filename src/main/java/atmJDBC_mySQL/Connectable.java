package atmJDBC_mySQL;

import java.io.IOException;
import java.util.List;

public interface Connectable {
    List<Customer> readCustomers() throws IOException;

    void update(Customer customer);
}
