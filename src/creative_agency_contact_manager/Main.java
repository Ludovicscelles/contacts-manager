package creative_agency_contact_manager;

public class Main {

  public static void main(String[] args) {

    CAContactManager caContactManager = new CAContactManager();
    CAContactSeeder.seed(caContactManager);

    caContactManager.listCaContacts();
  }
}