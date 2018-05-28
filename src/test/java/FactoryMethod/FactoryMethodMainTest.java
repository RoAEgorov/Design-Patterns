package FactoryMethod;

import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodMainTest {

    @Test
    public void classMethodTest() {
        Assert.assertTrue(FactoryMethodMain.class.equals(new FactoryMethodMain().getClass()));
    }
}
