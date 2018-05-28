package AbstractFactory.checkboxes;

import org.junit.Assert;
import org.junit.Test;

public class CheckboxTest {

    @Test
    public void WinButtonPainted(){
        Assert.assertEquals("You have created WindowsCheckbox.", new WindowsCheckbox().paint());
    }

    @Test
    public void MacButtonPainted() {
        Assert.assertEquals("You have created MacOSCheckbox.", new MacOSCheckbox().paint());
    }
}
