
public class swapAdjacentPairs {
    public class ListNode {
        ListNode next;
        int val;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode a = head;
        ListNode b = head.next;
        ListNode nextPair = b.next;
        b.next = a;
        a.next = swapPairs(nextPair);
        return b;
    }
}
