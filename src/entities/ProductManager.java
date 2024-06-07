package entities;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
  private List<Product> products = new ArrayList<>();

  public ProductManager() {}

  public ProductManager(List<Product> products) {
    for (Product product: products) {
      this.products.add(product);
    }
  }

  public List<Product> getProducts() {
    return products;
  }

  public void addProduct(Product newProduct) {
    products.add(newProduct);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }
}
