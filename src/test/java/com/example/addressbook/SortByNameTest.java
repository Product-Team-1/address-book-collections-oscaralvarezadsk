package com.example.addressbook;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SortByNameTest {
    @Test
    void sortedByNameCaseInsensitive() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/contacts.csv")) {
            List<Contact> contacts = AddressBook.loadFromCsv(in);
            List<Contact> sorted = AddressBook.sortedByName(contacts);
            assertTrue(sorted.size() >= 5);
            // Alex should appear before Chris, David, James, Linda, Maria, Sophia
            assertEquals("Alex Johnson", sorted.get(0).getName());
        }
    }
}
