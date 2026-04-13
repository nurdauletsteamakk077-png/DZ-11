abstract class User {
    protected int id;
    protected String name;
    protected String email;
    protected String address;
    protected String phone;

    public User(int id, String name, String email, String address, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public abstract void login();
    public abstract void updateData();
}
