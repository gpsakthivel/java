package in.entireskill;

abstract public class User {
    String username;

    public User(String username) {
        this.username = username;
    }

    abstract public void showMenu();
}
