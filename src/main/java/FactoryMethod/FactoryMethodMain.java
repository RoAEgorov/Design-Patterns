package FactoryMethod;

import FactoryMethod.buttons.Button;
import FactoryMethod.maker.MacMaker;
import FactoryMethod.maker.Maker;
import FactoryMethod.maker.WinMaker;

public final class FactoryMethodMain {
    public FactoryMethodMain() {
    }

    public static void main(String[] args) {
        {
            Maker maker = new WinMaker();
            Button button = maker.createButton();
            System.out.println(button.click());
        }

        {
            Maker maker = new MacMaker();
            Button button = maker.createButton();
            System.out.println(button.click());
        }
    }
}
