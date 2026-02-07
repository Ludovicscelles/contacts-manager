package contact_manager;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

/**
 * Manages a collection of contacts.
 * Provides methods to add a contact, list all contacts, and retrieve a contact
 * by its ID.
 */
public class ContactManager {

  private final List<Contact> contacts = new ArrayList<>();

  public List<Contact> getContacts() {
    return contacts;
  }

  public Contact getById(int id) {
    for (Contact contact : contacts) {
      if (contact.getId() == id) {
        return contact;
      }
    }
    return null;
  }

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public void seed() {
    addContact(new Contact("Smith", "John", "123-456-7890", "jsmith@example.com", "123 Main St", "Anytown", "CA", "12345", "USA", "Acme Corp",
        LocalDate.of(1990, 1, 1)));
    addContact(new Contact("Doe", "Jane", "987-654-3210", "jdoe@example.com", "456 Elm St", "Othertown", "NY", "54321", "USA", "Globex Inc",
        LocalDate.of(1985, 5, 15)));
    addContact(new Contact("Le Borgne", "Jean", "01-23-45-67-89", "jleborgne@example.com", "12, rue de la Paix", "Paris", "", "75000", "France", "Le Monde",
        LocalDate.of(1975, 3, 20)));
    addContact(new Contact("Müller", "Anna", "030-1234567", "amuller@example.com", "Hauptstrasse 5", "Berlin", "", "10115", "Germany", "Siemens",
        LocalDate.of(1988, 7, 10)));
  }

  public boolean updateContactById(int id, String lastname, String firstname, String phone, String email,
      String address,
      String city, String state, String zipCode, String country, String company, LocalDate birthday) {

    Contact existingContact = getById(id);
    if (existingContact == null) {
      return false;
    }

    if (hasText(lastname)) {
      existingContact.setLastname(lastname);
    }

    if (hasText(firstname)) {
      existingContact.setFirstname(firstname);
    }
    if (hasText(phone)) {
      existingContact.setPhoneNumber(phone);
    }
    if (hasText(email)) {
      existingContact.setEmail(email);
    }
    if (hasText(address)) {
      existingContact.setAddress(address);
    }
    if (hasText(city)) {
      existingContact.setCity(city);
    }
    if (hasText(state)) {
      existingContact.setState(state);
    }
    if (hasText(zipCode)) {
      existingContact.setZipCode(zipCode);
    }
    if (hasText(country)) {
      existingContact.setCountry(country);
    }
    if (hasText(company)) {
      existingContact.setCompany(company);
    }
    if (birthday != null) {
      existingContact.setBirthday(birthday);
    }

    return true;
  }

  private boolean hasText(String text) {
    return text != null && !text.isBlank();
  }

  public boolean removeContactById(int id) {
    Contact contactToRemove = getById(id);
    if (contactToRemove != null) {
      contacts.remove(contactToRemove);
      return true;
    }
    return false;
  }

  public List<Contact> searchContacts(String query) {

    String q = query.toLowerCase();

    List<Contact> results = new ArrayList<>();

    for (Contact contact : contacts) {
      if (field(contact.getLastname()).contains(q)
          || field(contact.getFirstname()).contains(q)
          || field(contact.getEmail()).contains(q)
          || field(contact.getCompany()).contains(q)) {
        results.add(contact);
      }
    }
    return results;
  }

  private String field(String field) {
    return field == null ? "" : field.toLowerCase();
  }

  public void listContacts() {
    for (Contact contact : contacts) {
      System.out.println(contact);
    }
  }

}