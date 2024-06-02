package entities;

public class Address {
  private String country;
  private String state;
  private String city;
  private String street;
  private String zipCode;
  private String complement;
  private String referencePoint;

  public Address(String country, String state, String city, String street, String zipCode, String complement,
      String referencePoint) {
    this.country = country;
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

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }

  public String getReferencePoint() {
    return referencePoint;
  }

  public void setReferencePoint(String referencePoint) {
    this.referencePoint = referencePoint;
  }
}
