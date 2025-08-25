package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwapNodesInPairsTest {
    @Test
    public void testSwapPairs_basic() {
        SwapNodesInPairs.ListNode l1 = new SwapNodesInPairs.ListNode(1);
        l1.next = new SwapNodesInPairs.ListNode(2);
        l1.next.next = new SwapNodesInPairs.ListNode(3);
        l1.next.next.next = new SwapNodesInPairs.ListNode(4);
        SwapNodesInPairs snp = new SwapNodesInPairs();
        SwapNodesInPairs.ListNode result = snp.swapPairs(l1);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
    }
}
