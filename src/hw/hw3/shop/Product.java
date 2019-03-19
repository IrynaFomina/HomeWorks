package hw.hw3.shop;

public class Product {
    private String productName;
    private Float price;
    private Boolean isAvaliable;

    public Product(String productName, Float price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public Float getPrice() {
        return price;
    }

    public Boolean getAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(Boolean avaliable) {
        isAvaliable = avaliable;
    }
}
