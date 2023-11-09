package creational_patterns.factoryMethod.factory;

import creational_patterns.factoryMethod.buttons.Button;
import creational_patterns.factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
