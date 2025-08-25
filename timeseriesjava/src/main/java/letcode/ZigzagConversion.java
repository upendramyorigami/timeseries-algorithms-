package letcode;

public class ZigzagConversion {
    // LeetCode 6: Zigzag Conversion
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();
        int i = 0, step = 1;
        for (char c : s.toCharArray()) {
            rows[i].append(c);
            if (i == 0) step = 1;
            if (i == numRows - 1) step = -1;
            i += step;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        return result.toString();
    }
}
