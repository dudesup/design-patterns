package creational_patterns.factoryMethod;

import creational_patterns.factoryMethod.factory.Dialog;
import creational_patterns.factoryMethod.factory.HtmlDialog;
import creational_patterns.factoryMethod.factory.WindowsDialog;

public class Demo {
    public static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}
