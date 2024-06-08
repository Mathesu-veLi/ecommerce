package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Product {
  private String uuid = UUID.randomUUID().toString();
  private String name;
  private Double price;
  private Integer stock;
  private Integer quantity;

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

  public Double getPrice() {
    return price;
  }

  public Integer getStock() {
    return stock;
  }

  public String getUuid() {
    return uuid;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Map<String, Object> getHashMap() {
    Map<String, Object> productMap = new HashMap<>();
    productMap.put("name", getName());
    productMap.put("price", getPrice());

    return productMap;
  }
}

// TODO: Creates Price class to control discounts in the products prices
// TODO: Creates categories of products using enum