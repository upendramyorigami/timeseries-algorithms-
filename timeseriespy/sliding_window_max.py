from collections import deque
from typing import List

def sliding_window_max(nums: List[int], k: int) -> List[int]:
    """
    Returns a list of the maximums of each sliding window of size k in the input list nums.
    """
    if not nums or k <= 0:
        return []

    result = []
    window = deque()  # stores indices

    for i, num in enumerate(nums):
        # Remove indices that are out of the current window
        while window and window[0] <= i - k:
            window.popleft()
        # Remove indices whose corresponding values are less than num
        while window and nums[window[-1]] < num:
            window.pop()
        window.append(i)
        # Append current max to result
        if i >= k - 1:
            result.append(nums[window[0]])
    return result