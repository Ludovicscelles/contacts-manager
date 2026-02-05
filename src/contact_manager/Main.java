package contact_manager;

import java.time.LocalDate;

// Main class to demonstrate the functionality of the ContactManager and Contact classes.
public class Main {

  public static void main(String[] args) {
    ContactManager contactManager = new ContactManager();
    Contact contact1 = new Contact("Doe", "John", "1234567890", "jdoe@example.com", "123 Main St", "Anytown",
        "Anystate", "12345", "USA", "Example Inc.", LocalDate.of(1990, 1, 1));
    Contact contact2 = new Contact("Smith", "Jane", "0987654321", "jsmith@example.com", "456 Elm St", "Othertown",
        "Otherstate", "54321", "USA", "Example Inc.", LocalDate.of(1992, 2, 2));
    Contact contact3 = new Contact("Dupont", "Jean", "0123456789", "jdupont@example.com", "12, rue de la Paix", "Paris",
        "Ile-de-France", "75000", "France", "Dupont SA", LocalDate.of(1985, 3, 3));
    Contact contact4 = new Contact("Müller", "Anna", "9876543210", "amuller@example.com", "34, Hauptstrasse", "Berlin",
        "Berlin", "10115", "Germany", "Müller GmbH", LocalDate.of(1988, 4, 4));
    contactManager.addContact(contact1);
    contactManager.addContact(contact2);
    contactManager.addContact(contact3);
    contactManager.addContact(contact4);
    contactManager.listContacts();

  }
}