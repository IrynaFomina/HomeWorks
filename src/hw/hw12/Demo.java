package hw.hw12;

public class Demo {
    public static void main(String[] args) {
        IButton button = new MacFabrica().createButton();
        System.out.print("Добавить в диалог кнопку ");
        button.paint();
    }

    void addButton(){

    }
}
