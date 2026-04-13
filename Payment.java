class Payment {
    private int id;
    private String type;
    private double amount;
    private String status;

    public Payment(int id, String type, double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public void process() {
        status = "SUCCESS";
        System.out.println("Payment processed");
    }

    public void refund() {
        status = "REFUNDED";
        System.out.println("Payment refunded");
    }
}
