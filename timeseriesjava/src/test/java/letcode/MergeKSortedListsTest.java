package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeKSortedListsTest {
    @Test
    public void testMergeKLists_basic() {
        MergeKSortedLists.ListNode l1 = new MergeKSortedLists.ListNode(1);
        l1.next = new MergeKSortedLists.ListNode(4);
        l1.next.next = new MergeKSortedLists.ListNode(5);
        MergeKSortedLists.ListNode l2 = new MergeKSortedLists.ListNode(1);
        l2.next = new MergeKSortedLists.ListNode(3);
        l2.next.next = new MergeKSortedLists.ListNode(4);
        MergeKSortedLists.ListNode l3 = new MergeKSortedLists.ListNode(2);
        l3.next = new MergeKSortedLists.ListNode(6);
        MergeKSortedLists mksl = new MergeKSortedLists();
        MergeKSortedLists.ListNode[] lists = new MergeKSortedLists.ListNode[]{l1, l2, l3};
        MergeKSortedLists.ListNode result = mksl.mergeKLists(lists);
        int[] expected = {1,1,2,3,4,4,5,6};
        for (int val : expected) {
            assertEquals(val, result.val);
            result = result.next;
        }
    }
}
