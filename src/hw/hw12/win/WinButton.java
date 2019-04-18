package hw.hw12.win;

import hw.hw12.IButton;

public class WinButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Имя компонента "+ COMPONENT_NAME + "Семейство (Windows)");
    }
}
