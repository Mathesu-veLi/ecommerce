package entities;

import java.util.UUID;

public class Product {
  private String uuid = UUID.randomUUID().toString();
  private String name;
  private Double price;
  private Integer stock;

  public Product(String name, Double price, Integer stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public Product() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public String getUuid() {
    return uuid;
  }
}

// TODO: Creates Price class to control discounts in the products prices
// TODO: Creates categories of products using enum