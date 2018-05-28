package AbstractFactory.buttons;

import AbstractFactory.buttons.Button;

public class MacOSButton implements Button {
    @Override
    public String paint() {
        return "You have created MacOSButton.";
    }
}
