import java.util.HashSet;
import java.util.Set;

package com.leetcode;


public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        Set<Character> seen = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    // Example usage
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solver = new LongestSubstringWithoutRepeatingCharacters();
        String input = "abcabcbb";
        System.out.println("Length of longest substring: " + solver.lengthOfLongestSubstring(input));
    }
}