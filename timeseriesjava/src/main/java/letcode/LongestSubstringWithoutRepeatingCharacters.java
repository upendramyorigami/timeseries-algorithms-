package letcode;

public class LongestSubstringWithoutRepeatingCharacters {
    // LeetCode 3: Longest Substring Without Repeating Characters
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int maxLen = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(index[s.charAt(i)], start);
            maxLen = Math.max(maxLen, i - start + 1);
            index[s.charAt(i)] = i + 1;
        }
        return maxLen;
    }
}
