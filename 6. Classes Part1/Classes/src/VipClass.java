public class VipClass {

  private String name;
  private String email;
  private int phoneNumber;

  VipClass() {
    this("defaultName", "defaultEmail@gmail.com", 1254);
  }

  VipClass(String name, String email) {
    this(name, email, 04157);
  }

  VipClass(String name, String email, int phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

}
