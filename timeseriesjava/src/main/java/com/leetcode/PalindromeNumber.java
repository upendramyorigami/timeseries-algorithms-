package com.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x, reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        int test = 121;
        System.out.println(test + " is palindrome? " + pn.isPalindrome(test));
    }
}