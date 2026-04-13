import java.util.List;

class Order {
    private int id;
    private String status;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(int id, Customer customer, List<Product> products) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        calculateTotal();
    }

    private void calculateTotal() {
        totalAmount = 0;
        for (Product p : products) {
            totalAmount += p.getPrice();
        }
    }

    public void placeOrder() {
        status = "CREATED";
        System.out.println("Order placed");
    }

    public void cancel() {
        status = "CANCELLED";
        System.out.println("Order cancelled");
    }

    public void pay() {
        status = "PAID";
        System.out.println("Order paid");
    }
}
