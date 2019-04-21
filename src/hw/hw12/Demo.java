package hw.hw12;

public class Demo {
    public static void main(String[] args) {
        IButton button = new MacFabric().createButton();
        System.out.print("Добавить в диалог кнопку ");
        button.paint();
    }

    void addButton(){

    }
}
