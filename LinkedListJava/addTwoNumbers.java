
public class addTwoNumbers {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            if (sum <= 9) {
                carry = 0;
                ListNode a = new ListNode(sum);
                ans.next = a;
                ans = ans.next;
            } else {
                int rem = sum % 10;
                carry = sum / 10;
                ListNode a = new ListNode(rem);
                ans.next = a;
                ans = ans.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + carry;
            int rem = sum % 10;
            carry = sum / 10;
            ListNode a = new ListNode(rem);
            ans.next = a;
            ans = ans.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.val + carry;
            int rem = sum % 10;
            carry = sum / 10;
            ListNode a = new ListNode(rem);
            ans.next = a;
            ans = ans.next;
            l2 = l2.next;
        }
        if (carry > 0) {
            ListNode a = new ListNode(carry);
            ans.next = a;
        }
        return temp.next;
    }
}
