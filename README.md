# Address Book with Collections and Streams

This GitHub Classroom kata mirrors real-world work with messy CSV data. You’ll load contacts, validate rows using a custom exception, and query with Java Streams.

## How to run
```bash
./gradlew test
```

Or compile & run a `main` if you add one:
```bash
javac src/main/java/com/example/addressbook/AddressBook.java
java com.example.addressbook.AddressBook
```

## Tasks (driven by tests)
1. Load valid contacts from `contacts.csv`.
2. Throw a custom exception for malformed rows and log errors without crashing.
3. Search by name (partial, case-insensitive).
4. Filter by city (case-insensitive).
5. Filter by phone prefix.
6. Return unique cities (`Set<String>`).
7. Sort contacts by name (case-insensitive).
8. Group & count contacts by city (`Map<String, Long>`).

> Templates are intentionally minimal so you write most of the code. Read each test to see expected behaviour and method signatures.
