import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StockSpanTest {

    @Test
    public void testCalculateSpan_basicCase() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpan = {1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expectedSpan, StockSpan.calculateSpan(prices));
    }

    @Test
    public void testCalculateSpan_allIncreasing() {
        int[] prices = {10, 20, 30, 40, 50};
        int[] expectedSpan = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpan, StockSpan.calculateSpan(prices));
    }

    @Test
    public void testCalculateSpan_allDecreasing() {
        int[] prices = {50, 40, 30, 20, 10};
        int[] expectedSpan = {1, 1, 1, 1, 1};
        assertArrayEquals(expectedSpan, StockSpan.calculateSpan(prices));
    }

    @Test
    public void testCalculateSpan_singleElement() {
        int[] prices = {42};
        int[] expectedSpan = {1};
        assertArrayEquals(expectedSpan, StockSpan.calculateSpan(prices));
    }

    @Test
    public void testCalculateSpan_emptyArray() {
        int[] prices = {};
        int[] expectedSpan = {};
        assertArrayEquals(expectedSpan, StockSpan.calculateSpan(prices));
    }
}