package FactoryMethod.maker;

import FactoryMethod.buttons.WinButton;

public class WinMaker implements Maker {

    @Override
    public WinButton createButton() {
        return new WinButton();
    }
}
