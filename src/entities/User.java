package entities;

public class User {
  private String name;
  private String email;
  private String password;
  private Cpf cpf;
  private String phoneNumber;

  public User(String name, String email, String password, String cpf, String phoneNumber) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.cpf = new Cpf(cpf);
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public Cpf getCpf() {
    return cpf;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
}
