package entities;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
  private List<Product> products = new ArrayList<>();

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
