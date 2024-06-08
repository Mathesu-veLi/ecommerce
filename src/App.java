import entities.Product;
import entities.ProductManager;
import entities.Users.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product("Camisa do Megadeth", 40.00, 2);
        
        productManager.addProduct(product1);

        Customer user = new Customer("Matheus", "matheuslevit@gmail.com", "veli15");

        user.cart.addProduct(productManager, product1);
    }
}
