package com.example.addressbook;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PhonePrefixTest {
    @Test
    void filterByPhonePrefix() throws Exception {
        try (InputStream in = getClass().getResourceAsStream("/contacts.csv")) {
            List<Contact> contacts = AddressBook.loadFromCsv(in);
            List<Contact> ukMobiles = AddressBook.filterByPhonePrefix(contacts, "07");
            assertTrue(ukMobiles.size() >= 4);
            assertTrue(ukMobiles.stream().allMatch(c -> c.getPhone().startsWith("07")));
        }
    }
}
