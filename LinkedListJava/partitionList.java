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
        temp1.next = greaterThanX.next;
        return lessThanX.next;
    }
    public ListNode partition2(ListNode head, int x) {
        ListNode lessThanX = new ListNode(-1);
        ListNode  temp1 = lessThanX;
        ListNode greaterThanX = new ListNode(-1);
        ListNode  temp2 = greaterThanX;

        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                temp1.next = temp;
                temp1 = temp;
                temp = temp.next;
                temp1.next = null;
            } else {
                temp2.next = temp;
                temp2 = temp;
                temp = temp.next;
                temp2.next = null;
            }
            
        }
        temp1.next = greaterThanX.next;
        return lessThanX.next;
    }
}
