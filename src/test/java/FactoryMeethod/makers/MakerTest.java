package FactoryMeethod.makers;

import FactoryMethod.buttons.MacButton;
import FactoryMethod.buttons.WinButton;
import FactoryMethod.maker.MacMaker;
import FactoryMethod.maker.WinMaker;
import org.junit.Assert;
import org.junit.Test;

public class MakerTest {

    @Test
    public void WinMakerTest() {
        Assert.assertEquals(WinButton.class, new WinMaker().createButton().getClass());
    }

    @Test
    public void MacMakerTest() {
        Assert.assertEquals(MacButton.class, new MacMaker().createButton().getClass());
    }

}
