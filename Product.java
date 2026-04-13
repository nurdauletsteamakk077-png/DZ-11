class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String category;

    public Product(int id, String name, String description, double price, int stock, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public void create() {
        System.out.println("Product created");
    }

    public void update() {
        System.out.println("Product updated");
    }

    public void delete() {
        System.out.println("Product deleted");
    }

    public double getPrice() {
        return price;
    }
}
