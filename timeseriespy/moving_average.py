def moving_average(data, window_size):
    """
    Calculate the moving average of a 1D list or array.

    Args:
        data (list or array-like): Input data.
        window_size (int): Size of the moving window.

    Returns:
        list: Moving average values.
    """
    if window_size < 1:
        raise ValueError("window_size must be at least 1")
    if len(data) < window_size:
        return []

    averages = []
    window_sum = sum(data[:window_size])
    averages.append(window_sum / window_size)

    for i in range(window_size, len(data)):
        window_sum += data[i] - data[i - window_size]
        averages.append(window_sum / window_size)

    return averages