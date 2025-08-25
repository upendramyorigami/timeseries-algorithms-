package letcode;

public class TextJustification {
    // LeetCode 68: Text Justification
    public java.util.List<String> fullJustify(String[] words, int maxWidth) {
        java.util.List<String> res = new java.util.ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int len = words[i].length(), j = i + 1;
            while (j < words.length && len + 1 + words[j].length() <= maxWidth) {
                len += 1 + words[j].length();
                j++;
            }
            StringBuilder sb = new StringBuilder();
            int spaces = maxWidth - len + (j - i - 1);
            if (j == words.length || j - i == 1) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(' ');
                }
                for (int k = sb.length(); k < maxWidth; k++) sb.append(' ');
            } else {
                int space = spaces / (j - i - 1), extra = spaces % (j - i - 1);
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < space + (k - i < extra ? 1 : 0); s++) sb.append(' ');
                    }
                }
            }
            res.add(sb.toString());
            i = j;
        }
        return res;
    }
}
