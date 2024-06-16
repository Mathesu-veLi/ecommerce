import entities.Product;
import entities.ProductManager;
import entities.Users.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product("Camisa do Megadeth", 40.00, 2));
        productManager.addProduct(new Product("A", 100.00, 3));

        Customer user = new Customer("Matheus", "matheuslevit@gmail.com", "veli15");

        System.out.println(productManager.getProducts());
    }
}
