package letcode;

public class RomanToInteger {
    // LeetCode 13: Roman to Integer
    public int romanToInt(String s) {
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10); map.put('L', 50);
        map.put('C', 100); map.put('D', 500); map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = map.get(s.charAt(i));
            if (i < s.length() - 1 && val < map.get(s.charAt(i + 1))) {
                sum -= val;
            } else {
                sum += val;
            }
        }
        return sum;
    }
}
