package contact_manager;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

// Main class to demonstrate the functionality of the ContactManager and Contact classes.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        while (true) {

            System.out.println("""
                    ===== CONTACT MANAGER =====
                    1 - Add contact
                    2 - List contacts
                    3 - Search by id
                    4 - Update contact
                    5 - Delete contact
                    6 - Search by name
                    0 - Quit
                    """);

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter lastname: ");
                    String lastname = scanner.nextLine();

                    System.out.print("Enter firstname: ");
                    String firstname = scanner.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.println("Enter address: ");
                    String address = scanner.nextLine();

                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();

                    System.out.print("Enter state or area: ");
                    String state = scanner.nextLine();

                    System.out.print("Enter postal code: ");
                    String zipCode = scanner.nextLine();

                    System.out.print("Enter country: ");
                    String country = scanner.nextLine();

                    System.out.print("Enter company: ");
                    String company = scanner.nextLine();

                    System.out.print("Enter birthday (YYYY-MM-DD): ");
                    String birthdayInput = scanner.nextLine();
                    LocalDate birthday = LocalDate.parse(birthdayInput);

                    Contact contact = new Contact(lastname, firstname, phone, email, address, city, state, zipCode,
                            country, company, birthday);

                    contactManager.addContact(contact);
                }

                case 2 -> {
                    contactManager.listContacts();
                }

                case 3 -> {
                    System.out.print("Enter contact ID: ");
                    int id = scanner.nextInt();
                    Contact found = contactManager.getById(id);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Contact not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter contact ID to update");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new lastname: ");
                    String newLastname = scanner.nextLine();

                    System.out.print("Enter a new firstname: ");
                    String newFirstname = scanner.nextLine();

                    System.out.print("Enter a new phone number: ");
                    String newPhone = scanner.nextLine();

                    System.out.print("Enter a new adresse email: ");
                    String newEmail = scanner.nextLine();

                    System.out.print("Enter a new address: ");
                    String newAddress = scanner.nextLine();

                    System.out.print("Enter a new city name: ");
                    String newCity = scanner.nextLine();

                    System.out.print("Enter a new state or area: ");
                    String newState = scanner.nextLine();

                    System.out.print("Enter a new postal code: ");
                    String newZipCode = scanner.nextLine();

                    System.out.print("Enter a new country: ");
                    String newCountry = scanner.nextLine();

                    System.out.print("Enter a new company: ");
                    String newCompany = scanner.nextLine();

                    System.out.print("Enter a new date of birth: ");
                    String newBirthdayInput = scanner.nextLine();
                    LocalDate newBirthday = LocalDate.parse(newBirthdayInput);

                    Contact updatedContact = new Contact(newLastname, newFirstname, newPhone, newEmail, newAddress,
                            newCity, newState, newZipCode, newCountry, newCompany, newBirthday);

                    boolean updated = contactManager.updateContact(idToUpdate, updatedContact);
                    if (updated) {
                        System.out.println("Contact updated successfully.");
                    } else {
                        System.out.println("Contact not found. Update failed.");
                    }

                }

                case 0 -> {
                    System.out.println("Bye!");
                    scanner.close();
                    return;
                }

                default -> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

        }

    }

}
