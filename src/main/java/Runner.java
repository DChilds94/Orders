import db.DBCustomer;
import models.Customer;

import java.util.List;

public class Runner {


    public static void main(String[] args) {
        Customer customer1 = new Customer("Dan", "Childs");
        Customer customer2 = new Customer("Wiktoria",  "Potocka");
        Customer customer3 = new Customer("Nick", "Jones");

        DBCustomer.save(customer1);
        DBCustomer.save(customer2);
        DBCustomer.save(customer3);

        DBCustomer.delete(customer3);

        customer1.setFirstName("Daniel");
        DBCustomer.update(customer1);


        List<Customer> customers = DBCustomer.getCustomers();

        Customer foundCustomer = DBCustomer.findById(customer1.getId());
    }
}

