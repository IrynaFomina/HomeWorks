package hw.hw12;

import hw.hw12.win.WinButton;
import hw.hw12.win.WinCheckBox;

public class WinFabric extends Fabric {
    public static final String OS = "Windows";
    @Override
    IButton createButton() {
        return new WinButton();
    }

    @Override
    ICheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
