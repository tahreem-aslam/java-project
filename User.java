package org.example.demo4;

public class User {
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String passwd) {
        return password.equals(passwd);
    }

    //    @Overridede
    public String serialize() {
        return username + "|" + password; // Example serialization format
    }

    public static User deserialize(String line, boolean isTeacher) {
        // Deserialization logic
        String[] parts = line.split("\\|", -1);
        if (parts.length < 2) return null;
        String user = parts[0];
        String pass = parts[1];
        // Return appropriate User object based on isTeacher if needed
        return new User(user, pass);
    }
}
