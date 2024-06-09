package entities;

import java.util.ArrayList;
import java.util.HashMap;
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
      Map<String, Object> productHashMap = new HashMap<>();
      productHashMap.put("name", product.getName());
      productHashMap.put("price", product.getPrice());
      productHashMap.put("stock", product.getStock());
      productsHashMap.add(productHashMap);
    }
    
    return productsHashMap;
  }

  public Product getProduct(String Uuid) {
    Integer productIndex = getProductIndex(Uuid);
    return products.get(productIndex);
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
