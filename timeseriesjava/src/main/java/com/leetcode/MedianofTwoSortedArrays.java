package com.leetcode;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m > n) {
            // Ensure nums1 is the smaller array
            return findMedianSortedArrays(nums2, nums1);
        }
        int imin = 0, imax = m, halfLen = (m + n + 1) / 2;
        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = halfLen - i;
            if (i < m && nums2[j - 1] > nums1[i]) {
                imin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                imax = i - 1;
            } else {
                int maxLeft;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if```
package com.leetcode;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int midIndex = totalLength / 2;
        boolean isEven = totalLength % 2 == 0;

        int i = 0, j = 0, count = 0;
        int prev = 0, curr = 0;

        while (count <= midIndex) {
            prev = curr;
            if (i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
            count++;
        }

        if (isEven) {
            return (prev + curr) / 2.0;
        } else {
            return curr;
        }
    }
}