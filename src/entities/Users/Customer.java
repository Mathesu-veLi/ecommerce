package entities.Users;

import java.util.ArrayList;
import java.util.List;

import entities.Address;
import entities.Cart;
import entities.Cpf;

public class Customer extends User {
  private Cpf cpf;
  private String phoneNumber;

  private List<Address> addresses = new ArrayList<>();

  public Cart cart = new Cart();

  public Customer(String name, String email, String password) {
    super(name, email, password);
  }

  public Customer(String name, String email, String password, String cpf, String phoneNumber, List<Address> addresses) {
    super(name, email, password);
    this.cpf = new Cpf(cpf);
    this.phoneNumber = phoneNumber;
    this.addresses = addresses;
  }

  public String getCpf() {
    return String.valueOf(cpf);
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void addAddress(Address newAddress) {
    addresses.add(newAddress);
  }
}
