package org.example.tsddemo;

public class User {
    private final String name;
    private final String password;
    private final String email;
    private final String phone;

    public User(String name, String password, String email, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    //TODO - Task 1.1 - Finish factory method
    static User of(String name, String password, String email, String phone) {
        return null;
    }

    //TODO - Task 1.3 - Finish another factory method, so it is possible to create User without email
    static User of(String name, String password, String phone) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    // This getter can return null if email is null
    public String getEmail() {
        return email;
    }

    //TODO - Task 1.2 - This getter should return a main company email if user has no email address.
    // Use Optional() to handle potential null email
    public String safelyGetEmail() {
        return getEmail();
    }

    public String getPhone() {
        return phone;
    }
}
