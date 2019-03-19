package hw.hw3;

import hw.hw3.client.Customer;
import hw.hw3.shop.Product;
import hw.hw3.shop.Seller;

public class InternetShopDemo {
    public static void main(String[] args) {
        Seller seller1 = new Seller("Seller1");
        Product product1 = new Product("Product1", 10.6F);
        Product product2 = new Product("Product2", 5.3F);
        seller1.setProductList(product1,product2);
        Customer customer1 = new Customer("Customer1","1111");

        customer1.addToOrder();
    }
}
