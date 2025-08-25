package letcode;

public class LetterCombinationsOfAPhoneNumber {
    // LeetCode 17: Letter Combinations of a Phone Number
    public java.util.List<String> letterCombinations(String digits) {
        java.util.List<String> res = new java.util.ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(res, map, digits, 0, new StringBuilder());
        return res;
    }
    private void backtrack(java.util.List<String> res, String[] map, String digits, int idx, StringBuilder sb) {
        if (idx == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String letters = map[digits.charAt(idx) - '0'];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(res, map, digits, idx + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
