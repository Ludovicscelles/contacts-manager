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

  // Method to update a contact's information based on its ID.
  // It retrieves the existing contact and updates its attributes using the
  // updateFrom method of the Contact class.
  public boolean updateContact(int id, Contact updatedContact) {
    Contact existingContact = getById(id);
    if (existingContact == null) {
      return false;
    }
    existingContact.updateFrom(updatedContact);
    return true;
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