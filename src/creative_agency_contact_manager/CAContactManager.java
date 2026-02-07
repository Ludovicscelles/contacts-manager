package creative_agency_contact_manager;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.math.BigDecimal;

public class CAContactManager {

  private final List<CAContact> caContacts = new ArrayList<>();

  public List<CAContact> getCaContacts() {
    return caContacts;
  }

  public void listCaContacts() {

    for (CAContact caContact : caContacts) {
      System.out.print(caContact);
      System.out.println();
    }
  }

  public void addCaContact(CAContact caContact) {
    caContacts.add(caContact);
  }

}