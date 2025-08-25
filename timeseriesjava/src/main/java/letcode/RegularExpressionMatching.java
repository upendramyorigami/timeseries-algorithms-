package letcode;

public class RegularExpressionMatching {
    // Recursive solution
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
    // Dynamic programming solution
    public boolean matches(String text, String pattern) {
        int tLen = text.length(), pLen = pattern.length();
        boolean[][] dp = new boolean[tLen + 1][pLen + 1];
        dp[0][0] = true;
        for (int j = 1; j <= pLen; j++) {
            if (pattern.charAt(j - 1) == '*' && j > 1) {
                dp[0][j] = dp[0][j - 2];
            }
        }
        for (int i = 1; i <= tLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                if (pattern.charAt(j - 1) == '.' || pattern.charAt(j - 1) == text.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (pattern.charAt(j - 2) == '.' || pattern.charAt(j - 2) == text.charAt(i - 1)) {
                        dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }
        return dp[tLen][pLen];
    }
}
