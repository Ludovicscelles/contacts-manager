package contact_manager;

import java.time.LocalDate;

public class ContactSeeder {

  public static void seed(ContactManager contactManager) {
    contactManager.addContact(new Contact("Smith", "John", "123-456-7890", "jsmith@example.com", "123 Main St",
        "Anytown", "CA", "12345", "USA", "Acme Corp",
        LocalDate.of(1990, 1, 1)));
    contactManager.addContact(new Contact("Doe", "Jane", "987-654-3210", "jdoe@example.com", "456 Elm St", "Othertown",
        "NY", "54321", "USA", "Globex Inc",
        LocalDate.of(1985, 5, 15)));
    contactManager.addContact(new Contact("Le Borgne", "Jean", "01-23-45-67-89", "jleborgne@example.com",
        "12, rue de la Paix", "Paris", "", "75000", "France", "Le Monde",
        LocalDate.of(1975, 3, 20)));
    contactManager.addContact(new Contact("Müller", "Anna", "030-1234567", "amuller@example.com", "Hauptstrasse 5",
        "Berlin", "", "10115", "Germany", "Siemens",
        LocalDate.of(1988, 7, 10)));
  }
}