package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseNodesInKGroupTest {
    @Test
    public void testReverseKGroup_basic() {
        ReverseNodesInKGroup.ListNode l1 = new ReverseNodesInKGroup.ListNode(1);
        l1.next = new ReverseNodesInKGroup.ListNode(2);
        l1.next.next = new ReverseNodesInKGroup.ListNode(3);
        l1.next.next.next = new ReverseNodesInKGroup.ListNode(4);
        l1.next.next.next.next = new ReverseNodesInKGroup.ListNode(5);
        ReverseNodesInKGroup rng = new ReverseNodesInKGroup();
        ReverseNodesInKGroup.ListNode result = rng.reverseKGroup(l1, 2);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }
}
