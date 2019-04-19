package hw.hw12.mac;

import hw.hw12.IButton;
import hw.hw12.MacFabric;

public class MacButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Имя компонента "+ COMPONENT_NAME + " Семейство (MacOS) " + MacFabric.OS);
    }
}
