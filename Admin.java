class Admin extends User {

    public Admin(int id, String name, String email, String address, String phone) {
        super(id, name, email, address, phone);
    }

    @Override
    public void login() {
        System.out.println("Admin logged in");
    }

    @Override
    public void updateData() {
        System.out.println("Admin updated data");
    }

    public void logAction(String action) {
        System.out.println("LOG: " + action);
    }
}
