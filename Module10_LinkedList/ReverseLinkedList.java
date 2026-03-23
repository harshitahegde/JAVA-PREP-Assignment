package Module10_LinkedList;

// LeetCode 206 – Reverse Linked List
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
