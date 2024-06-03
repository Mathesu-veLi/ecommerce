import entities.Product;
import entities.ProductManager;
import entities.User;

public class App {
    public static void main(String[] args) throws Exception {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product("Camisa do CV", 40.00, 2);

        productManager.addProduct(product1);

        User user = new User("Matheus", "matheuslevit@gmail.com", "veli15");

        user.cart.addProduct(productManager, product1);
    }
}
