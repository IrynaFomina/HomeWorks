package hw.hw3.shop;

public class Seller {
    private String sellerName;
    private Product productList[];
    private Double account = 0D;

    public Seller(String sellerName, Product[] productList) {
        this.sellerName = sellerName;
        this.productList = productList;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public Double getAccount() {
        return account;
    }
}
