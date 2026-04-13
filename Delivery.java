class Delivery {
    private int id;
    private String address;
    private String status;
    private String courier;

    public Delivery(int id, String address, String courier) {
        this.id = id;
        this.address = address;
        this.courier = courier;
    }

    public void send() {
        status = "SHIPPED";
        System.out.println("Delivery sent");
    }

    public void track() {
        System.out.println("Tracking delivery...");
    }

    public void complete() {
        status = "DELIVERED";
        System.out.println("Delivery completed");
    }
}
