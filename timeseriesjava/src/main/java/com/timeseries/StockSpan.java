import java.util.Stack;

package com.timeseries;


public class StockSpan {

    /**
     * Calculates the stock span values for the given array of prices.
     * The span of the stock's price on a given day is defined as the maximum number of consecutive days 
     * (starting from that day and going backwards) for which the price of the stock was less than or equal to its price on the given day.
     *
     * @param prices array of stock prices
     * @return array of span values
     */
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }

    // Example usage
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.print("Stock Span: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}