package hw.hw3.client;

public class Customer {
    private String customerName;
    private String cardNumber;
    private Double account = 100D;
    private Order order;


    public Customer(String customerName, String cardNumber) {
        this.customerName = customerName;
        this.cardNumber = cardNumber;
        order = new Order(customerName);
    }

    public boolean payOrder() {
        return Double.compare(account, order.getSum()) == 1;
    }

    public Order getOrder() {
        return order;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public String getCustomerName() {
        return customerName;
    }
}
