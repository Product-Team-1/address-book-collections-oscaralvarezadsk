package com.example.addressbook;

/** Minimal template: fill in fields, constructor, getters, and toString(). */
public class Contact {
    private final String name;
    private final String email;
    private final String phone;
    private final String city;

    public Contact(String name, String email, String phone, String city) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return String.format("%s <%s> %s [%s]", name, email, phone, city);
    }
}
