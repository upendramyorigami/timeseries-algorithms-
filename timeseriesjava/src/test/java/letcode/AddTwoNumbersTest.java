package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers_basic() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        l1.next = new AddTwoNumbers.ListNode(4);
        l1.next.next = new AddTwoNumbers.ListNode(3);
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.next = new AddTwoNumbers.ListNode(6);
        l2.next.next = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers atn = new AddTwoNumbers();
        AddTwoNumbers.ListNode result = atn.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }
}
