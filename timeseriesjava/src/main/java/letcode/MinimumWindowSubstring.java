package letcode;

public class MinimumWindowSubstring {
    // LeetCode 76: Minimum Window Substring
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int left = 0, right = 0, count = t.length(), minLen = Integer.MAX_VALUE, minStart = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                if (map.get(c) > 0) count--;
                map.put(c, map.get(c) - 1);
            }
            right++;
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                char cl = s.charAt(left);
                if (map.containsKey(cl)) {
                    map.put(cl, map.get(cl) + 1);
                    if (map.get(cl) > 0) count++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
