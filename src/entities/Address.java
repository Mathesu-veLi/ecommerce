package entities;

public class Address {
  private String country;
  private String state;
  private String city;
  private String street;
  private String zipCode;
  private String complement;
  private String referencePoint;

  public Address(String contry, String state, String city, String street, String zipCode, String complement,
      String referencePoint) {
    this.country = contry;
    this.state = state;
    this.city = city;
    this.street = street;
    this.zipCode = zipCode;
    this.complement = complement;
    this.referencePoint = referencePoint;
  }

  public Address(String country, String state, String city, String street, String zipCode) {
    this.country = country;
    this.state = state;
    this.city = city;
    this.street = street;
    this.zipCode = zipCode;
  }  
}
