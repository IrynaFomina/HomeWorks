package hw.hw13;
/* - создать класс User, добавить в него свойсва String name, String lastName, double age, Address address;
 реализовать в классе User методы swallowCopy, deepCopy через конструкторы и интерфейс Clonable*/
public class User implements Cloneable{
    private String name;
    private String lastName;
    private double age;
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(String name, String lastName, double age, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User cloneUser = (User) super.clone();
        Address _adrress = new Address(this.address.getCity()
                ,this.address.getStreet()
                ,this.address.getHouse());
        cloneUser.setAddress(_adrress);
        return cloneUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    User swallowCopy(){
        return new User(this.name, this.lastName,this.age,this.address);
    }
}
