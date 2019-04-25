package hw.hw13;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Dnipro","Gagrina",9);
        User user1 = new User("Vasya","Petrov",45,address);

        User user2 = user1.clone();
        user2.setAddress(new Address("Kiev", "Khrecshatic",26));


        System.out.println("User1: "+user1.toString());
        System.out.println("User2: "+user2.toString());

        User user3 = user1.swallowCopy();
        System.out.println("User3: "+user3.toString());
        user3.setAddress(new Address("Dnipro","Topol",9));

        System.out.println("User1: "+user1.toString());
        System.out.println("User2: "+user2.toString());
        System.out.println("User3: "+user3.toString());

        user1.setAge(50);


        System.out.println("User1: "+user1.toString());
        System.out.println("User2: "+user2.toString());
        System.out.println("User3: "+user3.toString());




    }
}
