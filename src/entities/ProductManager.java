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

  public List<Product> getProducts() {
    return products;
  }

  public Product getProduct(String Uuid) {
    Optional<Product> productFound = products.stream().filter(product -> product.getUuid() == Uuid).findFirst();

    if (productFound.isPresent()) {
      return productFound.get();
    }
    return null;
    // FIXME: Throws a error when the productFound is empty
  }

  public void addProduct(Product newProduct) {
    products.add(newProduct);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }
}
