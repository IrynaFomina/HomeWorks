package hw.hw13;
/* - создать класс User, добавить в него свойсва String name, String lastName, double age, Address address;
 реализовать в классе User методы swallowCopy, deepCopy через конструкторы и интерфейс Clonable*/
public class User implements Cloneable{
    String name;
    String lastName;
    double age;
    Address address;

    public User(String name, String lastName, double age, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    User swalloCopy(){
//        Address address_ = new Address();
//        return new User();
//    }
}
