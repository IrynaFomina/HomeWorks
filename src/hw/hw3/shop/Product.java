package hw.hw3.shop;

public class Product {
    private String productName;
    private Float price;
    private Boolean isAvailable;

    public Product(String productName, Float price, Boolean isAvailable) {
        this.productName = productName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getProductName() {
        return productName;
    }

    public Float getPrice() {
        return price;
    }

    public Boolean isAvailable() {
        return isAvailable;
    }

    public void setAvaliable(Boolean available) {
        isAvailable = available;
    }
}
