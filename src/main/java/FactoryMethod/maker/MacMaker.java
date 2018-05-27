package FactoryMethod.maker;

import FactoryMethod.buttons.MacButton;

public class MacMaker extends Maker {

    @Override
    public MacButton createButton() {
        return new MacButton();
    }
}
