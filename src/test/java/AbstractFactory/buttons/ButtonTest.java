package AbstractFactory.buttons;

import org.junit.Assert;
import org.junit.Test;

public class ButtonTest {

    @Test
    public void WinButtonPainted(){
        Assert.assertEquals("You have created WindowsButton.", new WindowsButton().paint());
    }

    @Test
    public void MacButtonPainted() {
        Assert.assertEquals("You have created MacOSButton.", new MacOSButton().paint());
    }
}
