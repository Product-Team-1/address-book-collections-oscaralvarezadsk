package com.example.addressbook;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class GroupByCityTest {
    @Test
    void groupCountByCity() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/contacts.csv")) {
            List<Contact> contacts = AddressBook.loadFromCsv(in);
            Map<String, Long> counts = AddressBook.groupCountByCity(contacts);
            assertTrue(counts.get("London") >= 1);
            assertTrue(counts.get("Manchester") >= 1);
        }
    }
}
