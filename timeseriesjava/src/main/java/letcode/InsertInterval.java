package letcode;

public class InsertInterval {
    // LeetCode 57: Insert Interval
    public int[][] insert(int[][] intervals, int[] newInterval) {
        java.util.List<int[]> res = new java.util.ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) res.add(intervals[i++]);
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        while (i < intervals.length) res.add(intervals[i++]);
        return res.toArray(new int[res.size()][]);
    }
}
