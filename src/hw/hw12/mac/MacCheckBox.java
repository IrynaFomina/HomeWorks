package hw.hw12.mac;

import hw.hw12.ICheckBox;
import hw.hw12.MacFabric;

public class MacCheckBox implements ICheckBox {
    @Override
    public void paint() {
        System.out.println("Имя компонента "+ COMPONENT_NAME + "Семейство "+ MacFabric.OS);
    }
}
