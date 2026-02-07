package creative_agency_contact_manager;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CAContact {

  private static int nextId = 1;
  private final int id;
  private static final BigDecimal DEFAULT_SALARY = BigDecimal.ZERO;
  private static final CAAddress DEFAULT_ADDRESS = new CAAddress("Unknown", "Unknown", "Unknown", "Unknown", "Unknown");

  private String lastname;
  private String firstname;
  private String email;
  private String phoneNumber;
  private String department;
  private String job;
  private String responsibilities;
  private LocalDate birthday;
  private LocalDate entryDate;
  private BigDecimal salary;
  private CAAddress address;

  public CAContact(String lastname, String firstname, String email, String phoneNumber, String department, String job,
      String responsibilities, LocalDate birthday, LocalDate entryDate, BigDecimal salary, CAAddress address) {
    this.id = nextId++;
    this.lastname = lastname;
    this.firstname = firstname;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.department = department;
    this.job = job;
    this.responsibilities = responsibilities;
    this.birthday = birthday;
    this.entryDate = entryDate;
    this.salary = (salary == null) ? DEFAULT_SALARY : salary;
    this.address = address == null ? DEFAULT_ADDRESS : address;
  }

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getResponsibilities() {
    return responsibilities;
  }

  public void setResponsibilities(String responsibilities) {
    this.responsibilities = responsibilities;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public LocalDate getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(LocalDate entryDate) {
    this.entryDate = entryDate;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = (salary == null) ? DEFAULT_SALARY : salary;
  }

  public CAAddress getAddress() {
    return address;
  }

  public void setAddress(CAAddress address) {
    this.address = (address == null) ? DEFAULT_ADDRESS : address;
  }

  @Override
  public String toString() {
    return """
        Creative Agency Contact :
        ID: %d,
        Lastname: %s,
        Firstname: %s,
        Email: %s,
        Phone Number: %s,
        Department: %s,
        Job: %s,
        Responsibilities: %s,
        Birthday: %s,
        Entry date: %s,
        Salary: %s,
        Address: %s
   
        """.formatted(id, lastname, firstname, email, phoneNumber, department, job, responsibilities, birthday,
        entryDate, salary, address);
  }
}
