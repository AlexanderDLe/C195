package Models;

public class User {
    private static String username;
    private static String password;
    private static int userID;

    // Default Initializer
    public User() {
        this.userID = 0;
        this.username = null;
        this.password = null;
    }

    // Constructor
    public User(int userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
    }

    // Getters
    private int getUserID() { return this.userID; }

    private String getUsername() { return this.username; }

    private String getPassword() { return this.password; }

    // Setters
    private void setUserID(int userID) { this.userID = userID; }

    private void setUsername(String username) { this.username = username; }

    private void setPassword(String password) {  this.password = password; }
}