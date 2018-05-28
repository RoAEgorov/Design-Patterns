package FactoryMethod.maker;

import FactoryMethod.buttons.MacButton;

public class MacMaker implements Maker {

    @Override
    public MacButton createButton() {
        return new MacButton();
    }
}
