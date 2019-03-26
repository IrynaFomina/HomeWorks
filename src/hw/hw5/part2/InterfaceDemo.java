package hw.hw5.part2;

 interface IAnimal {
    String getSize();
    String getName();
}

 interface ISwimable {
     void swim();
}

 interface IFlyable {
     void fly();
}

interface IBird extends IAnimal{
     void sing();
     void buildNest();

}

interface IFish extends IAnimal {
    String getHabitat();
}

class Nightingale implements IBird, IFlyable{
    @Override
    public String getName() {
        return "Nightingale";
    }

    @Override
    public String getSize() {
        System.out.println("Nightingale is small bird");
    }

    @Override
    public void fly() {
        System.out.println("Nightingale flies");
    }

    @Override
    public void buildNest() {
        System.out.println("Nightingale builds a nest");
    }

    @Override
    public void sing() {
        System.out.println("tui-tui");
    }
}

class Zander implements IFish{
    @Override
    public String getName() {
        return "Zander";
    }

    @Override
    public String getSize() {
        return "medium";
    }

    @Override
    public void swim() {
        System.out.println("Zander swim in a " + getHabitat());

    }

    @Override
    public String getHabitat() {
        return "river";
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ISwimable zander = new Zander();
        System.out.println(zander.getName()" is " + zander.getSize()+ " and " + zander.swi);
        ((Zander) zander).getName()
    }
}


