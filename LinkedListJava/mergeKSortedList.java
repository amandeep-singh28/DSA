public class mergeKSortedList {
    public class ListNode {
        ListNode next;
        int val;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode merge2(ListNode head1, ListNode head2) {
        ListNode temp = new ListNode(-1);
        ListNode tempC = temp;
        ListNode tempA = head1;
        ListNode tempB = head2;
        while (tempA != null && tempB != null) {
            if (tempA.val < tempB.val) {
                temp.next = tempA;
                temp = temp.next;
                tempA = tempA.next;
            } else {
                temp.next = tempB;
                temp = temp.next;
                tempB = tempB.next;
            }
        }
        while (tempA != null) {
            temp.next = tempA;
            temp = temp.next;
            tempA = tempA.next;
        }
        while (tempB != null) {
            temp.next = tempB;
            temp = temp.next;
            tempB = tempB.next;
        }
        return tempC.next;
    }
    // public ListNode mergeKLists(ListNode[] lists) {
    //     if (lists.length == 0) return null;
    //     if (lists.length == 1) return lists[0];
    //     ListNode mergeTwo = null;
    //     for (int i = 0; i < lists.length - 1; i++) {
    //         ListNode current = lists[i];
    //         ListNode next = lists[i + 1];
    //         if (i == 0) mergeTwo = merge2(current, next);
    //         else mergeTwo = merge2(mergeTwo, next);
    //     }
    //     return mergeTwo;
    // }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        ListNode ans = divide(lists, 0, lists.length - 1);
        return ans;
    }

    private ListNode divide(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }

        int mid = left + (right - left) / 2;

        ListNode l1 = divide(lists, left, mid);
        ListNode l2 = divide(lists, mid + 1, right);

        ListNode merged = merge2(l1, l2);
        return merged;
    }
}