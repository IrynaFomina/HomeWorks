package hw.hw12;


import hw.hw12.mac.MacButton;
import hw.hw12.mac.MacCheckBox;

public class MacFabric extends Fabric {
    public static final String OS = "Mac";

    @Override
    IButton createButton() {
        return new MacButton();
    }

    @Override
    ICheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
