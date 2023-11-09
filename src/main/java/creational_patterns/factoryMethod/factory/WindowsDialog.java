package creational_patterns.factoryMethod.factory;

import creational_patterns.factoryMethod.buttons.Button;
import creational_patterns.factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
