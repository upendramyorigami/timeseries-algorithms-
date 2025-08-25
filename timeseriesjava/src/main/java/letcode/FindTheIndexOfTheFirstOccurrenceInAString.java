package letcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    // LeetCode 28: Find the Index of the First Occurrence in a String
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}
