def calculate_stock_span(prices):
    """
    Calculate the stock span for each day.
    Span is the number of consecutive days before the current day
    where the price was less than or equal to today's price.

    Args:
        prices (list): List of stock prices.

    Returns:
        list: List of spans.
    """
    n = len(prices)
    span = [0] * n
    stack = []

    for i in range(n):
        # Pop prices from stack while stack is not empty and price at stack top is less than or equal to current price
        while stack and prices[stack[-1]] <= prices[i]:
            stack.pop()
        # If stack is empty, all previous prices are less than current price
        span[i] = i + 1 if not stack else i - stack[-1]
        stack.append(i)
    return span

# Example usage:
if __name__ == "__main__":
    prices = [100, 80, 60, 70, 60, 75, 85]
    print(calculate_stock_span(prices))  # Output: [1, 1, 1, 2, 1, 4, 6]