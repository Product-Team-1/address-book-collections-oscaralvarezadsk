package com.example.addressbook;

/** Custom exception to indicate a CSV line is malformed or incomplete. */
public class InvalidContactFormatException extends Exception {
    public InvalidContactFormatException(String message) { super(message); }
}
