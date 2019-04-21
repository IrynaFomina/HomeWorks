package hw.hw13;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Dnipro","Gagrina",9);
        User user1 = new User("Vasya","Petrov",45,address);
            User user2 = (User) user1.clone();


        System.out.println(user1.toString());
        System.out.println(user2.toString());



    }
}
