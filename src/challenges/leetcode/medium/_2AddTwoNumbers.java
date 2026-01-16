package challenges.leetcode.medium;

public class _2AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new ListNode(sum % 10);

            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }

        return dummy.next;
    }

    private static void printListNode(ListNode l) {
        while (l != null) {
            System.out.print(l.val + ", ");
            l = l.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(6))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        printListNode(addTwoNumbers(l1, l2));
    }
}
