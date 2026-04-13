import java.util.ArrayList;
import java.util.List;

class Customer extends User {
    private List<Order> orders = new ArrayList<>();

    public Customer(int id, String name, String email, String address, String phone) {
        super(id, name, email, address, phone);
    }

    public void register() {
        System.out.println("Customer registered");
    }

    @Override
    public void login() {
        System.out.println("Customer logged in");
    }

    @Override
    public void updateData() {
        System.out.println("Customer data updated");
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
