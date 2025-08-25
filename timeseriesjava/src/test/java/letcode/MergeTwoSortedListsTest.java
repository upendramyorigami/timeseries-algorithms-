package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedListsTest {
    @Test
    public void testMergeTwoLists_basic() {
        MergeTwoSortedLists.ListNode l1 = new MergeTwoSortedLists.ListNode(1);
        l1.next = new MergeTwoSortedLists.ListNode(2);
        l1.next.next = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode l2 = new MergeTwoSortedLists.ListNode(1);
        l2.next = new MergeTwoSortedLists.ListNode(3);
        l2.next.next = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
        MergeTwoSortedLists.ListNode result = mtsl.mergeTwoLists(l1, l2);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
    }
}
