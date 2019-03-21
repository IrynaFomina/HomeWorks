package hw.hw3.client;

import hw.hw3.shop.Product;

import java.util.Arrays;

public class Order {
    private String[] products;
    private Float sum;
    private String customerName;

    Order(String customerName) {
        products = new String[0];
        sum = 0F;
        this.customerName = customerName;
    }

    public boolean addProduct(Product product) {
        if (product.isAvailable()) {
            products = Arrays.copyOf(this.products, this.products.length + 1);
            products[products.length - 1] = product.getProductName();
            setSum(sum + product.getPrice());
            return true;
        } else
            return false;
    }

    private void setSum(Float sum) {
        this.sum = sum;
    }

    public Float getSum() {
        return sum;
    }

    public String getCustomerName() {
        return customerName;
    }
}
