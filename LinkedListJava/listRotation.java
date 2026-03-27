package LinkedListJava;

public class listRotation{
    class ListNode {
        ListNode next;
    }
    public int calcSize(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;
        int size = calcSize(head);
        if (size == k) return head;
        if (k > size) {
            k = k % size;
        }
        if (k == 0) return head;
        ListNode newHead = head;
        ListNode prev = null;
        int jump = size - k;
        int count = 0;
        while (count < jump) {
            count++;
            prev = newHead;
            newHead = newHead.next;
        }
        
        ListNode temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        prev.next = null;
        temp.next = head;
        return newHead;
        
    }
}