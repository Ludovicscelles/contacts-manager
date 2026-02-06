package contact_manager;

import java.time.LocalDate;
import java.util.List;

// Main class to demonstrate the functionality of the ContactManager and Contact classes.
public class Main {

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Contact contact1 = new Contact("Doe", "John", "1234567890", "jdoe@example.com", "123 Main St", "Anytown",
                "California", "12345", "USA", "Fashion and Beauty", LocalDate.of(1990, 1, 1));
        Contact contact2 = new Contact("Smith", "Jane", "0987654321", "jsmith@example.com", "456 Elm St", "Othertown",
                "New York", "54321", "USA", "Tech Company", LocalDate.of(1992, 2, 2));
        Contact contact3 = new Contact("Dupont", "Jean", "0123456789", "jdupont@example.com", "12, rue de la Paix",
                "Paris",
                "Ile-de-France", "75000", "France", "Dupont SA", LocalDate.of(1985, 3, 3));
        Contact contact4 = new Contact("Müller", "Anna", "9876543210", "amuller@example.com", "34, Hauptstrasse",
                "Berlin",
                "Berlin", "10115", "Germany", "Müller GmbH", LocalDate.of(1988, 4, 4));
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(contact4);
        contactManager.listContacts();

        Contact found = contactManager.getById(2);

        if (found != null) {
            System.out.println("Contact found : ");
            System.out.println(found);
        } else {
            System.out.println("Contact with the specified ID not found.");
        }

        // Demonstrating the removal of a contact
        boolean removed = contactManager.removeContactById(3);

        if (removed) {
            System.out.println("Contact with specified ID removed successfully.");
        } else {
            System.out.println("Contact with specified ID not found. No contact removed.");
        }

        // List contacts after removal to verify
        System.out.println("Contacts after removal:");
        contactManager.listContacts();

        // Demonstrating the update of a contact
        Contact updatedContact = new Contact("Smith", "Jane", "1112223333", "jane.smith@example.com", "789 Oak St",
                "Newtown",
                "New York", "54321", "USA", "Tech Company", LocalDate.of(1993, 2, 2));
        boolean updated = contactManager.updateContact(2, updatedContact);

        if (updated) {
            System.out.println("Contact with specified ID updated successfully.");
        } else {
            System.out.println("Contact with specified ID not found. No contact updated.");
        }

        // List contacts after update to verify
        System.out.println("Contacts after update:");
        contactManager.listContacts();

        // Demonstrating the search functionality
        System.out.println("Search results for 'Smith':");
        List<Contact> searchResults = contactManager.searchContacts("Smith");

        for (Contact contact : searchResults) {
            System.out.println(contact);
        }

    }

}