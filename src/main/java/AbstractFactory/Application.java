package AbstractFactory;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.factories.GUIFactory;
import com.sun.istack.internal.NotNull;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(@NotNull GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        System.out.println(button.paint());
        System.out.println(checkbox.paint());
    }
}
