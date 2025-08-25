import pytest
from timeseriespy.sliding_window_max import sliding_window_max

def test_basic_case():
    arr = [1, 3, -1, -3, 5, 3, 6, 7]
    k = 3
    expected = [3, 3, 5, 5, 6, 7]
    result = sliding_window_max(arr, k)
    assert result == expected

def test_window_size_one():
    arr = [4, 2, 12, 3]
    k = 1
    expected = [4, 2, 12, 3]
    result = sliding_window_max(arr, k)
    assert result == expected

def test_window_size_equals_array_length():
    arr = [2, 1, 5, 3]
    k = 4
    expected = [5]
    result = sliding_window_max(arr, k)
    assert result == expected

def test_empty_array():
    arr = []
    k = 3
    expected = []
    result = sliding_window_max(arr, k)
    assert result == expected

def test_window_size_greater_than_array_length():
    arr = [1, 2]
    k = 5
    expected = []
    result = sliding_window_max(arr, k)
    assert result == expected

def test_negative_numbers():
    arr = [-2, -1, -3, -4, -1, -2]
    k = 2
    expected = [-1, -1, -3, -1, -1]
    result = sliding_window_max(arr, k)
    assert result == expected