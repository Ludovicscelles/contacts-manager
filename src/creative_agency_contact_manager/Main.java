package creative_agency_contact_manager;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    CAContactManager caContactManager = new CAContactManager();
    caContactManager
        .addCaContact(new CAContact("Smith", "John", "jsmith@example.com", "123-456-7890", "Marketing", "Manager",
            "Oversee marketing campaigns and strategies.", LocalDate.of(1985, 5, 20), LocalDate.of(2010, 3, 15),
            new BigDecimal("1599.99"), new CAAddress("123", "Main St", "Anytown", "12345", "USA")));

    caContactManager.listCaContacts();
  }
}