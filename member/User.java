package member;

public class User extends People{
    public User(String name, int phone) {
        super(name, phone);
    }
    public User(String username, int phone, String address) {
        super(username, phone, address);
    }
}
