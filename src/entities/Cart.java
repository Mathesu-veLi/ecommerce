package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  private List<Product> products = new ArrayList<>();

  public Product addItem(Product newProduct) {
    products.add(newProduct);
    return newProduct;
  }

  public Product removeProduct(Product product) {
    products.remove(product);
    return product;
  }

  public List<Product> getProducts() {
    return products;
  }

  public double getTotalPrice() {
    double totalPrice = 0;
    for (Product product : products) {
      totalPrice += product.getPrice();
    }
    return totalPrice;
  }
}
