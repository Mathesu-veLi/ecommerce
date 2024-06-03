package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  private List<Product> products = new ArrayList<>();

  public void addProduct(ProductManager productManager, Product newProduct) {
    if (productManager.getProducts().contains(newProduct)) {
      products.add(newProduct);
    }
  }

  public void removeProduct(Product product) {
    products.remove(product);
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
