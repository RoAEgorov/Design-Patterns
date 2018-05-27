package FactoryMeethod.buttons;

import FactoryMethod.buttons.MacButton;
import FactoryMethod.buttons.WinButton;
import org.junit.Assert;
import org.junit.Test;

public class ButtonTest {

    @Test
    public void WinButtonClicked() {
        Assert.assertEquals("win buttons clicked", new WinButton().click());
    }

    @Test
    public void MacButtonClicked() {
        Assert.assertEquals("mac buttons clicked", new MacButton().click());
    }
}
