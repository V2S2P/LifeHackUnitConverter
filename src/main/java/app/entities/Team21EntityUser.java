package app.entities;

public class Team21EntityUser {
    private int userId;
    private String username;
    private String password;

    public Team21EntityUser(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
