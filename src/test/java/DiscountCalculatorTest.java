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
    void shouldGive5PercentDiscountWhenPriceIsLessThan500(){
        var price = 400.00;

        var priceWithDiscount = discountCalculator.calculate(price);

        assertEquals(380, priceWithDiscount);
    }

    @Test
    void shouldGive10PercentDiscountWhenPriceIs500(){
        var price = 500.00;

        var priceWithDiscount = discountCalculator.calculate(price);

        assertEquals(450.00, priceWithDiscount);
    }

    @Test
    void shouldGive20DiscountWhenPriceIs1000(){
        var price = 1000.00;

        var priceWithDiscount = discountCalculator.calculate(price);

        assertEquals(800.00, priceWithDiscount);
    }
}