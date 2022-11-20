package behavioral_patterns.strategy.paymentMethod.paymentStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements IPayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;

    private boolean signedIn;

    static {
        DATA_BASE.put("user1", "superUser@gmail.com");
        DATA_BASE.put("user2", "amazingUser@gmail.com");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("Enter email: ");
                email = READER.readLine();
                System.out.println("Enter password");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful");
                } else {
                    System.out.println("Wrong email or password");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean pay(BigDecimal paymentAmout) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmout + "using PayPal");
            return true;
        }
        return false;
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
