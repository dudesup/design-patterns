package behavioral_patterns.strategy.paymentMethod.paymentStrategies;

import java.math.BigDecimal;

public class PayByCreditCard implements IPayStrategy{
    @Override
    public boolean pay(BigDecimal paymentAmout) {
        return false;
    }

    @Override
    public void collectPaymentDetails() {

    }
}
