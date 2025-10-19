package restaurant_management_system;

import java.util.ArrayList;
import java.util.List;

class Customer extends User {
    private static int counter = 1;
    private String customerId;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String phone) {
        super(name, phone);
        this.customerId = "CUST" + counter++;
    }

    public String getCustomerId() { return customerId; }
    public List<Order> getOrders() { return orders; }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public String toString() {
        return customerId + " - " + name + " (" + phone + ")";
    }
}
