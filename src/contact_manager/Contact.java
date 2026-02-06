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

  // Method to update the contact's attributes based on another contact object.
  public void updateFrom(Contact contactToUpdate) {
    this.lastname = contactToUpdate.lastname;
    this.firstname = contactToUpdate.firstname;
    this.phoneNumber = contactToUpdate.phoneNumber;
    this.email = contactToUpdate.email;
    this.address = contactToUpdate.address;
    this.city = contactToUpdate.city;
    this.state = contactToUpdate.state;
    this.zipCode = contactToUpdate.zipCode;
    this.country = contactToUpdate.country;
    this.company = contactToUpdate.company;
    this.birthday = contactToUpdate.birthday;
  }

  // Getters and setters for all attributes
  public int getId() {
    return id;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  // Returns a formatted multi-line string representation of the contact for
  // console display.
  @Override
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