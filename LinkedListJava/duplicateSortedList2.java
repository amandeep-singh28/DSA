import java.util.LinkedHashMap;
import java.util.Map;

public class duplicateSortedList2{
    class ListNode {
        ListNode next;
        int val;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(-1);
        ListNode tempHead = newHead;
        Map<Integer, Integer> hm = new LinkedHashMap<>();
        
        ListNode temp = head;
        while (temp != null) {
            if (hm.containsKey(temp.val) == false) {
                hm.put(temp.val, 1);
            } else {
                int freq = hm.get(temp.val);
                hm.put(temp.val, freq + 1);
            }
            temp = temp.next;
        }
        System.out.println(hm);
        for (var e : hm.entrySet()) {
            if (e.getValue() == 1) {
                ListNode a = new ListNode(e.getKey());
                tempHead.next = a;
                tempHead = tempHead.next;
            }
        }
        return newHead.next;
    }
}