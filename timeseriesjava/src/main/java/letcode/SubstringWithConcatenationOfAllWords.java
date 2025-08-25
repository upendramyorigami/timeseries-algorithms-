package letcode;

public class SubstringWithConcatenationOfAllWords {
    // LeetCode 30: Substring with Concatenation of All Words
    public java.util.List<Integer> findSubstring(String s, String[] words) {
        java.util.List<Integer> res = new java.util.ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return res;
        int wordLen = words[0].length(), totalLen = wordLen * words.length;
        java.util.Map<String, Integer> wordCount = new java.util.HashMap<>();
        for (String word : words) wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        for (int i = 0; i <= s.length() - totalLen; i++) {
            java.util.Map<String, Integer> seen = new java.util.HashMap<>();
            int j = 0;
            while (j < words.length) {
                int start = i + j * wordLen;
                String sub = s.substring(start, start + wordLen);
                if (!wordCount.containsKey(sub)) break;
                seen.put(sub, seen.getOrDefault(sub, 0) + 1);
                if (seen.get(sub) > wordCount.get(sub)) break;
                j++;
            }
            if (j == words.length) res.add(i);
        }
        return res;
    }
}
