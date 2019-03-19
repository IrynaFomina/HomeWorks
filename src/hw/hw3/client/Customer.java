package hw.hw3.client;

public class Customer {
    private String customerName;
    private String cardNumber;
    private Order order;

    public Customer(String customerName, String cardNumber) {
        this.customerName = customerName;
        this.cardNumber = cardNumber;
        order = new Order();
    }

    public void addToOrder(){};
    
    private void removeFromOrder(){};

    private boolean payOrder(){
        return false;
    }
}
