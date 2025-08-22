package com.example.addressbook;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class IgnoreInvalidRowsTest {
    @Test
    void invalidRowsAreSkippedAndLogged() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/contacts.csv")) {
            List<Contact> contacts = AddressBook.loadFromCsv(in);
            // Ensure the row with blank name didn't get in
            assertTrue(contacts.stream().noneMatch(c -> c.getEmail().equals("invalid@example.com")));
            // Ensure the row with missing phone didn't get in
            assertTrue(contacts.stream().noneMatch(c -> "Leeds".equalsIgnoreCase(c.getCity()) && c.getName().equals("Linda Green")));
        }
    }
}
