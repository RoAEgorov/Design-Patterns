package FactoryMethod.maker;

import FactoryMethod.buttons.WinButton;

public class WinMaker extends Maker {

    @Override
    public WinButton createButton() {
        return new WinButton();
    }
}
