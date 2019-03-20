package hw.hw3;

import hw.hw3.client.Customer;
import hw.hw3.shop.Product;
import hw.hw3.shop.Seller;

public class InternetShopDemo {
    public static void main(String[] args) {

        Product product1 = new Product("Product1", 10.6F, true);
        Product product2 = new Product("Product2", 5.3F, false);
        Product[] productsList= new Product[2];
        productsList[0]=product1;
        productsList[1]=product2;
        Seller seller1 = new Seller("Seller1",productsList);


        Customer customer1 = new Customer("Customer1","1111");
        customer1.addToOrder(product1);
    }
}
