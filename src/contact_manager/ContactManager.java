package contact_manager;

import java.util.ArrayList;
import java.util.List;

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

  public void listContacts() {
    for (Contact contact : contacts) {
      System.out.println(contact);
    }
  }

}