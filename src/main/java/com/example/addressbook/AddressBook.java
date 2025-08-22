package com.example.addressbook;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** Intentionally minimal skeleton. Implement all methods. */
public class AddressBook {

    /** Load contacts from CSV InputStream, skipping header.
     *  - Map valid rows to Contact
     *  - On invalid line: throw InvalidContactFormatException from parseLine,
     *    catch it here, log to System.err, and skip the row.
     */
    public static List<Contact> loadFromCsv(InputStream input) {
        throw new UnsupportedOperationException("Implement loadFromCsv");
    }

    /** Parse a single CSV line into a Contact, enforcing validation rules.
     *  Throw InvalidContactFormatException on any issue.
     */
    public static Contact parseLine(String line) throws InvalidContactFormatException {
        throw new InvalidContactFormatException("Implement parseLine");
    }

    /** Streams-based queries (case-insensitive, partial where applicable). */
    public static List<Contact> searchByName(List<Contact> contacts, String query) {
        return java.util.Collections.emptyList();
    }

    public static List<Contact> filterByCity(List<Contact> contacts, String city) {
        return java.util.Collections.emptyList();
    }

    public static List<Contact> filterByPhonePrefix(List<Contact> contacts, String prefix) {
        return java.util.Collections.emptyList();
    }

    public static Set<String> uniqueCities(List<Contact> contacts) {
        return java.util.Collections.emptySet();
    }

    public static List<Contact> sortedByName(List<Contact> contacts) {
        return java.util.Collections.emptyList();
    }

    public static Map<String, Long> groupCountByCity(List<Contact> contacts) {
        return java.util.Collections.emptyMap();
    }
}
