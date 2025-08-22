package com.example.addressbook;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FilterByCityTest {
    @Test
    void filterByCityCaseInsensitive() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/contacts.csv")) {
            List<Contact> contacts = AddressBook.loadFromCsv(in);
            List<Contact> london = AddressBook.filterByCity(contacts, "london");
            assertTrue(london.size() >= 2, "At least two London contacts in CSV");
            assertTrue(london.stream().allMatch(c -> "London".equalsIgnoreCase(c.getCity())));
        }
    }
}
