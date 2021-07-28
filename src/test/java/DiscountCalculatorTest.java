import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountCalculatorTest {

    DiscountCalculator discountCalculator;

    @BeforeEach
    void setUp(){
        discountCalculator = new DiscountCalculator();
    }

    @Test
    void shouldReturnOkWhenApplicationIsReady() {
        String expected = "Ok";

        String actual = discountCalculator.healthCheck();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotGiveDiscountWhenPriceIs499(){
        var price = 499.99;

        var priceWithoutDiscount = discountCalculator.calculate(price);

        assertEquals(price, priceWithoutDiscount);
    }

    @Test
    void shouldNotGiveDiscountWhenPriceIs450(){
        var price = 450d;

        var priceWithoutDiscount = discountCalculator.calculate(price);

        assertEquals(price, priceWithoutDiscount);
    }

    @Test
    void shouldGiveDiscountWhenPriceIs500(){
        var price = 500.00;

        var priceWithDiscount = discountCalculator.calculate(price);

        assertEquals(450.00, priceWithDiscount);
    }
}