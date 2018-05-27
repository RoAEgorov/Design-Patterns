package FactoryMethod.buttons;

public class WinButton implements Button {
    @Override
    public String click() {
        return "win buttons clicked";
    }
}
