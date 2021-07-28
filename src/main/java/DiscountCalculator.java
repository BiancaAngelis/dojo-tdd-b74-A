public class DiscountCalculator {
    public String healthCheck() {
        return "Ok";
    }

    public double calculate(double price){
        double total = 0;
        if (price <= 499.99) {
            total = price;
        }
        else if (price >= 500.00 && price <= 999.99){
            total = price - (price * 0.10);
        }

        return total;
    }
}
