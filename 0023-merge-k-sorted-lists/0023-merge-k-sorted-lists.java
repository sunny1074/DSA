/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode list = new ListNode(-1);
        ListNode curr = list;

        for (ListNode head : lists) {
            if(head == null) continue;
            
            while(head != null){
                heap.add(new ListNode(head.val));
                head = head.next;
            }
        }
        while (!heap.isEmpty()){
            curr.next = heap.poll();
            curr = curr.next;
        }
        return list.next;
    }
}