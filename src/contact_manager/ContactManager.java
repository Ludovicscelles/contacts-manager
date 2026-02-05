package contact_manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages a collection of contacts.
 * Provides methods to add a contact and list all contacts.
 */
public class ContactManager {

  private final List<Contact> contacts = new ArrayList<>();

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public void listContacts() {
    for (Contact contact : contacts) {
      System.out.println(contact);
    }
  }

}