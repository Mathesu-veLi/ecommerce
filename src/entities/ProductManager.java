package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductManager {
  private List<Product> products = new ArrayList<>();

  public ProductManager(List<Product> products) {
    for (Product product : products) {
      this.products.add(product);
    }
  }

  public ProductManager() {
  }

  public String getProducts() {
    StringBuilder sb = new StringBuilder();
    for (Product product : products) {
      sb.append(String.format("%d: %s\n", products.indexOf(product), product.getName()));
    }
    return sb.toString();
  }

  public Integer getProductIndex(String Uuid) {
    Optional<Product> productFound = products.stream().filter(product -> product.getUuid() == Uuid).findFirst();
    if (productFound.isEmpty()) {
      return -1;
    }

    return products.indexOf(productFound.get());
  }

  public void addProduct(Product newProduct) {
    products.add(newProduct);
  }

  public void removeProduct(int productIndex) {
    products.remove(productIndex);
  }
}
