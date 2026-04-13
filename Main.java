import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Nurdaulet", "mail@mail.com", "Almaty", "123");

        Product p1 = new Product(1, "Phone", "iPhone", 500, 10, "Electronics");
        Product p2 = new Product(2, "Laptop", "MacBook", 1500, 5, "Electronics");

        Order order = new Order(1, customer, Arrays.asList(p1, p2));
        order.placeOrder();
        order.pay();

        Payment payment = new Payment(1, "CARD", 2000);
        payment.process();

        Delivery delivery = new Delivery(1, "Almaty", "DHL");
        delivery.send();
        delivery.complete();
    }
}
