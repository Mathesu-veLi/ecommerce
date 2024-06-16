package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

  public List<Map<String, Object>> getProducts() {
    List<Map<String, Object>> productsHashMap = new ArrayList<>();
    for (Product product : products) {
      productsHashMap.add(product.getHashMap());
    }
    
    return productsHashMap;
  }

  public Object getProduct(String Uuid) {
    Integer productIndex = getProductIndex(Uuid);
    return productIndex != -1 ?  products.get(productIndex) : productIndex;
  }

  private Integer getProductIndex(String Uuid) {
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
