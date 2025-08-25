package letcode;

public class RestoreIPAddresses {
    // LeetCode 93: Restore IP Addresses
    public java.util.List<String> restoreIpAddresses(String s) {
        java.util.List<String> res = new java.util.ArrayList<>();
        backtrack(res, s, 0, "", 0);
        return res;
    }
    private void backtrack(java.util.List<String> res, String s, int idx, String curr, int count) {
        if (count > 4) return;
        if (count == 4 && idx == s.length()) {
            res.add(curr.substring(0, curr.length() - 1));
            return;
        }
        for (int i = 1; i <= 3 && idx + i <= s.length(); i++) {
            String part = s.substring(idx, idx + i);
            if (part.length() > 1 && part.charAt(0) == '0') continue;
            if (Integer.parseInt(part) > 255) continue;
            backtrack(res, s, idx + i, curr + part + ".", count + 1);
        }
    }
}
