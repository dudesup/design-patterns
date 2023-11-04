package structural_patterns.decorator;

import java.util.logging.Logger;

public class Demo {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(Demo.class.getName());

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        LOGGER.info("- Input ----------------");
        LOGGER.info(salaryRecords);
        LOGGER.info("- Encoded --------------");
        LOGGER.info(plain.readData());
        LOGGER.info("- Decoded --------------");
        LOGGER.info(encoded.readData());
    }
}
