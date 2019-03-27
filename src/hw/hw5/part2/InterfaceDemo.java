package hw.hw5.part2;


interface IAnimal {
    String getSize();

    String getName();
}

interface ISwimable extends IAnimal {
    String swim();
}

interface IFlyable extends IAnimal {
    String fly();
}

interface IBird extends IAnimal {
    String sing();

    String buildNest();

}

interface IFish extends ISwimable {
    String getHabitat();
}

interface IZander extends IFish {

}

class Zander implements IZander {

    @Override
    public String getSize() {
        return "medium size";
    }

    @Override
    public String getName() {
        return "Zander";
    }

    @Override
    public String swim() {
        return "swim";
    }

    @Override
    public String getHabitat() {
        return "rivers";
    }
}

class Bird implements IBird {
    private String name;

    Bird(String name) {
        this.name = name;
    }

    @Override
    public String getSize() {
        return "small size";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sing() {
        return "tui-tui";
    }

    @Override
    public String buildNest() {
        return "build nest";
    }


}

public class InterfaceDemo {
    public static void main(String[] args) {
        IZander zander = new Zander();
        System.out.println(zander.getName() + " has " + zander.getSize() + " and " + zander.swim() + " in " + zander.getHabitat());
        IBird chicken = new Bird("Chicken");
        System.out.println(chicken.getName() + " has " + chicken.getSize()+ " and sings: "+ chicken.sing() + " but it can't fly");
    }
}
