import pytest
from timeseriespy.stock_span import calculate_stock_span

def test_stock_span_basic():
    prices = [100, 80, 60, 70, 60, 75, 85]
    expected = [1, 1, 1, 2, 1, 4, 6]
    assert calculate_stock_span(prices) == expected

def test_stock_span_all_increasing():
    prices = [10, 20, 30, 40, 50]
    expected = [1, 2, 3, 4, 5]
    assert calculate_stock_span(prices) == expected

def test_stock_span_all_decreasing():
    prices = [50, 40, 30, 20, 10]
    expected = [1, 1, 1, 1, 1]
    assert calculate_stock_span(prices) == expected

def test_stock_span_single_element():
    prices = [42]
    expected = [1]
    assert calculate_stock_span(prices) == expected

def test_stock_span_empty():
    prices = []
    expected = []
    assert calculate_stock_span(prices) == expected