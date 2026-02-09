package creative_agency_contact_manager;

public class CAAddress {

  private String number;
  private String street;
  private String city;
  private String postalCode;
  private String country;

  public CAAddress(String number, String street, String city, String postalCode, String country) {
    this.number = number;
    this.street = street;
    this.city = city;
    this.postalCode = postalCode;
    this.country = country;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "%s, %s, %s, %s, %s".formatted(number, street, city, postalCode, country);
  }
}