package behavioral_patterns.strategy.paymentMethod.paymentStrategies;

import java.math.BigDecimal;

public interface IPayStrategy {
    boolean pay(BigDecimal paymentAmout);
    void collectPaymentDetails();
}
