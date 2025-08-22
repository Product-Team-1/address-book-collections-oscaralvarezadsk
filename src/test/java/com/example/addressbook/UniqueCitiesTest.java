package com.example.addressbook;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class UniqueCitiesTest {
    @Test
    void uniqueCitiesSet() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/contacts.csv")) {
            List<Contact> contacts = AddressBook.loadFromCsv(in);
            Set<String> cities = AddressBook.uniqueCities(contacts);
            assertTrue(cities.contains("London"));
            assertTrue(cities.contains("Manchester"));
            assertTrue(cities.contains("Liverpool"));
        }
    }
}
