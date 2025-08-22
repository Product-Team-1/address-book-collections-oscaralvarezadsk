package com.example.addressbook;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SearchByNameTest {
    @Test
    void partialCaseInsensitiveNameSearch() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/contacts.csv")) {
            List<Contact> contacts = AddressBook.loadFromCsv(in);
            List<Contact> results = AddressBook.searchByName(contacts, "alex");
            assertTrue(results.stream().anyMatch(c -> c.getName().equals("Alex Johnson")));
        }
    }
}
