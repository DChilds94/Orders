//import db.DBCustomer;
import db.DBCustomer;
import db.DBOrder;
import models.Customer;
import models.Order;

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


        Order order1 = new Order("Google Pixel", 600.00);
        Order order2 = new Order("Yankee Candle", 10.00);
        Order order3 = new Order("Candy Cane", 1.00);

        DBOrder.save(order1);
        DBOrder.save(order2);
        DBOrder.save(order3);

        DBOrder.delete(order3);

        order1.setPrice(500.00);
        DBOrder.update(order1);

        List<Order> orders = DBOrder.getOrder();

        Order foundOrder = DBOrder.findById(order1.getId());


    }
}

