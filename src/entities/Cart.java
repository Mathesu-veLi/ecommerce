package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cart {
  private List<Product> products = new ArrayList<>();

  public Cart() {
  
  }



  public void addProduct(ProductManager productManager, Product newProduct) {
    if (!productManager.getProduct(newProduct.getUuid()).equals(-1)) {
      newProduct.setQuantity(1);
      products.add(newProduct);
    }

    // FIXME: Handle the error that getProduct will throw
    // TODO: Throw error if product not exists
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public List<Map<String, Object>> getProducts() {
    return products.stream().map(product -> product.getHashMap()).toList();
  }

  public double getTotalPrice() {
    double totalPrice = 0;
    for (Product product : products) {
      totalPrice += product.getPrice();
    }
    return totalPrice;
  }
}

// TODO: Creates the increaseQuantity(Product product) to increase the quantity
// of a product in the cart when the user tries to add an already added product