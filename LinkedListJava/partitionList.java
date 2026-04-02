public class partitionList {
    class ListNode {
        ListNode next;
        int val;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode partition(ListNode head, int x) {
        ListNode lessThanX = new ListNode(-1);
        ListNode  temp1 = lessThanX;
        ListNode greaterThanX = new ListNode(-1);
        ListNode  temp2 = greaterThanX;

        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                ListNode a = new ListNode(temp.val);
                temp1.next = a;
                temp1 = temp1.next;
            } else {
                ListNode a = new ListNode(temp.val);
                temp2.next = a;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        ListNode temp3 = lessThanX;
        while (temp3.next != null) {
            temp3 = temp3.next;
        }
        // greaterThanX = greaterThanX.next;
        temp3.next = greaterThanX.next;
        return lessThanX.next;
    }
}
