package hw.hw3.client;

import hw.hw3.shop.Product;

public class Customer {
    private String customerName;
    private String cardNumber;
    private Order order;

    public Customer(String customerName, String cardNumber) {
        this.customerName = customerName;
        this.cardNumber = cardNumber;
        order = new Order();
    }

    public void addToOrder(Product product) {
        if (order.addProduct(product)) {
            System.out.println("Товар " + product.getProductName() + " по цене " + product.getPrice() + " добавлен в корзину пользователя" + customerName);
        } else System.out.println("Товара нет в наличи");
    }

    private void removeFromOrder() {
    }

    ;

    private boolean payOrder() {
        return false;
    }
}
