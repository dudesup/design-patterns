package behavioral_patterns.strategy.paymentMethod;

import behavioral_patterns.strategy.paymentMethod.paymentStrategies.IPayStrategy;

import java.math.BigDecimal;

public class Order {
    private BigDecimal totalCost = BigDecimal.ZERO;
    private boolean isClosed = false;

    public void processOrder(IPayStrategy payStrategy) {
        payStrategy.collectPaymentDetails();
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal cost) {
        this.totalCost.add(cost);
    }
}
