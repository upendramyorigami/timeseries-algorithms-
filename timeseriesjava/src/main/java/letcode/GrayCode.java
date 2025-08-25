package letcode;

public class GrayCode {
    // LeetCode 89: Gray Code
    public java.util.List<Integer> grayCode(int n) {
        java.util.List<Integer> res = new java.util.ArrayList<>();
        res.add(0);
        for (int i = 0; i < n; i++) {
            int size = res.size();
            for (int j = size - 1; j >= 0; j--) {
                res.add(res.get(j) | (1 << i));
            }
        }
        return res;
    }
}
