package hw.hw12.win;

import hw.hw12.ICheckBox;

public class WinCheckBox implements ICheckBox {
    @Override
    public void paint() {
        System.out.println("Имя компонента "+ COMPONENT_NAME + "Семейство (Windows)");
    }
}
