package com.example.addressbook;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LoadValidContactsTest {
    @Test
    void loadsValidContactsFromCsv() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/contacts.csv")) {
            assertNotNull(in, "contacts.csv should be on classpath");
            List<Contact> contacts = AddressBook.loadFromCsv(in);
            // From provided CSV, at least 5 rows are valid
            assertTrue(contacts.size() >= 5, "Expected to load at least 5 valid contacts");
        }
    }
}
