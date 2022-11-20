package behavioral_patterns.strategy.paymentMethod.paymentStrategies;

import behavioral_patterns.strategy.paymentMethod.CreditCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class PayByCreditCard implements IPayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = READER.readLine();
            creditCard = new CreditCard(number, date, cvv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean pay(BigDecimal paymentAmout) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmout + " using Credit Card");
            creditCard.setAmount(creditCard.getAmount().subtract(paymentAmout));
            return true;
        }
        return false;
    }

    private boolean cardIsPresent() {
        return creditCard != null;
    }
}
