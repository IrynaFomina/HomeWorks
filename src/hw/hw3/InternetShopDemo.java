package hw.hw3;

import hw.hw3.client.Customer;
import hw.hw3.client.Order;
import hw.hw3.shop.Product;
import hw.hw3.shop.Seller;

public class InternetShopDemo {
    private static Customer customer1;
    private static Seller seller1;

    public static void main(String[] args) {

        Product product1 = new Product("Product1", 10.6F, true);
        Product product2 = new Product("Product2", 5.3F, false);
        Product[] productsList = new Product[2];
        productsList[0] = product1;
        productsList[1] = product2;
        seller1 = new Seller("Seller1", productsList);
        customer1 = new Customer("Customer1", "1111");
        addToOrder(customer1, product1); // добавление доступного товара
        addToOrder(customer1, product2); // попытка добавить товар, которого нет в наличии
        payOrder(customer1.getOrder());
    }

    private static void payOrder(Order order) {
        if (customer1.payOrder()) {
            customer1.setAccount(customer1.getAccount() - order.getSum());
            System.out.println("Пользоваетль " + customer1.getCustomerName() + " оплатил товар");
            seller1.setAccount(seller1.getAccount() + order.getSum());
        } else {
            System.out.println("На вашем счету недостаточно денег");
        }
    }

    private static void addToOrder(Customer customer, Product product) {
        if (product.isAvailable()) {
            customer.getOrder().addProduct(product);
            System.out.println("Товар " + product.getProductName() + " по цене " + product.getPrice() + " добавлен в корзину пользователя " + customer.getCustomerName());
        } else System.out.println("Товара " + product.getProductName() + " нет в наличии");
    }
}
