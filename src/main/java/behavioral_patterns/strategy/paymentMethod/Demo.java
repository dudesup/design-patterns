package behavioral_patterns.strategy.paymentMethod;

import behavioral_patterns.strategy.paymentMethod.paymentStrategies.IPayStrategy;
import behavioral_patterns.strategy.paymentMethod.paymentStrategies.PayByCreditCard;
import behavioral_patterns.strategy.paymentMethod.paymentStrategies.PayByPayPal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static Map<Integer, BigDecimal> priceOnProduct = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static IPayStrategy payStrategy;

    static {
        priceOnProduct.put(1, new BigDecimal(1200));
        priceOnProduct.put(2, new BigDecimal(400));
        priceOnProduct.put(3, new BigDecimal(5632));
        priceOnProduct.put(4, new BigDecimal(220));
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            BigDecimal cost;
            String contributeChoice;
            do {
                System.out.println("Please, select a product: " + "\n" +
                        "1 - Product 1" + "\n" +
                        "2 - Product 2" + "\n" +
                        "3 - Product 3" + "\n" +
                        "4 - Product 4" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProduct.get(choice);
                System.out.println("Count: ");
                BigDecimal count = new BigDecimal(reader.readLine());
                order.setTotalCost(cost.multiply(count));
                System.out.println("Do you want to continue selecting products? Y/N: ");
                contributeChoice = reader.readLine();
            } while (contributeChoice.equalsIgnoreCase("Y"));

            if (payStrategy == null) {
                System.out.println("Please, select payment method: " + "\n" +
                        "1 - PayPal" + "\n" +
                        "2 - CreditCard" + "\n"
                );
                int paymentMethod = Integer.parseInt(reader.readLine());
                if (paymentMethod == 1) {
                    payStrategy = new PayByPayPal();
                } else {
                    payStrategy = new PayByCreditCard();
                }
            }

            order.processOrder(payStrategy);

            System.out.println("Pay " + order.getTotalCost() + " CHF");
        }
    }
}
