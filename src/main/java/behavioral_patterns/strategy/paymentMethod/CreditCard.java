package behavioral_patterns.strategy.paymentMethod;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal amount;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.amount = new BigDecimal(100_000);
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
