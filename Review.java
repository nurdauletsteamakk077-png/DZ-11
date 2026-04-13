class Review {
    private int rating;
    private String comment;
    private Product product;

    public Review(int rating, String comment, Product product) {
        this.rating = rating;
        this.comment = comment;
        this.product = product;
    }

    public void addReview() {
        System.out.println("Review added");
    }
}
