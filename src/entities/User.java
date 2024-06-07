package entities;

import java.util.ArrayList;
import java.util.List;

public class User {
  private String id;
  private String name;
  private String email;
  private String password;
  private Cpf cpf;
  private String phoneNumber;

  private List<Address> addresses = new ArrayList<>();

  public Cart cart = new Cart();

  public User(String name, String email, String password, Cpf cpf, String phoneNumber, List<Address> addresses) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.cpf = cpf;
    this.phoneNumber = phoneNumber;
    this.addresses = addresses;
  }

  public User(String name, String email, String password, String cpf, String phoneNumber) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.cpf = new Cpf(cpf);
    this.phoneNumber = phoneNumber;
  }

  public User(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
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

  public void addAddress(Address newAddress) {
    addresses.add(newAddress);
  }
}
