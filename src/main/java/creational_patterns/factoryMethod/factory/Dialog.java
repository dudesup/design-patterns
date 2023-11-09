package creational_patterns.factoryMethod.factory;

import creational_patterns.factoryMethod.buttons.Button;

//base creator
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
