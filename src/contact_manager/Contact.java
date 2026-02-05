package contact_manager;

import java.time.LocalDate;

// Class representing a contact with various attributes such as name, phone number, email, address, etc.
public class Contact {

  private static int nextId = 1; // Static variable to generate unique IDs for contacts
  private final int id; // Unique identifier for each contact
  private String lastname;
  private String firstname;
  private String phoneNumber;
  private String email;
  private String address;
  private String city;
  private String state;
  private String zipCode;
  private String country;
  private String company;
  private LocalDate birthday;

  // Constructor to initialize a contact with all attributes
  public Contact(String lastname, String firstname, String phoneNumber, String email, String address, String city,
      String state,
      String zipCode, String country, String company, LocalDate birthday) {
    this.id = nextId++; // Assign a unique ID and increment the static counter
    this.lastname = lastname;
    this.firstname = firstname;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.country = country;
    this.company = company;
    this.birthday = birthday;

  }

  // Returns a formatted multi-line string representation of the contact for
  // console display.
  public String toString() {
    return """
        Contact:
        ID: %d
        Lastname: %s
        Firstname: %s
        Phone Number: %s
        Email: %s
        Address: %s
        City: %s
        State: %s
        Zip Code: %s
        Country: %s
        Company: %s
        Birthday: %s
        """.formatted(id, lastname, firstname, phoneNumber, email, address, city, state, zipCode, country, company,
        birthday);
  }
}