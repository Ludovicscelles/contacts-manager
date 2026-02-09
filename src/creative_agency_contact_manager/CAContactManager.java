package creative_agency_contact_manager;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.math.BigDecimal;

public class CAContactManager {

  private final List<CAContact> caContacts = new ArrayList<>();

  public List<CAContact> getCaContacts() {
    return new ArrayList<>(caContacts);
  }

  public void listCaContacts() {

    for (CAContact caContact : caContacts) {
      System.out.print(caContact);
      System.out.println();
    }
  }

  public void addCaContact(CAContact caContact) {
    if (caContact == null) {
      throw new IllegalArgumentException("CAContact cannot be null");
    }
    caContacts.add(caContact);
  }

}