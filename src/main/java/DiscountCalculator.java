import java.math.BigDecimal;

public class DiscountCalculator {
    public String healthCheck() {
        return "Ok";
    }

    public double calculate(double price){
        double total = 0;
        if (price < 500.00) {
            total = price * 0.95;
        }
        else if (price >= 500.00 && price <= 999.99){
            total = price * 0.90;
        }
        else if (price >= 1000){
            total = price * 0.80;
        }

        return total;
    }
}
