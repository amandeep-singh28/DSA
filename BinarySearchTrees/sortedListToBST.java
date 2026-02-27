package BinarySearchTrees;


public class sortedListToBST {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }

    }
    public TreeNode constructTree(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructTree(nums, low, mid - 1);
        root.right = constructTree(nums, mid + 1, high);
        return root;
    }

    public TreeNode sortedList(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int arr[] = new int[size];
        int i = 0;
        temp = head;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }
        int low = 0;
        int high = size - 1;
        TreeNode root = constructTree(arr, low, high);
        return root;
    }
}
