/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> h = new HashSet<>();
        while(head!=null){
            if(h.contains(head))
                return true;
            else
                h.add(head);
            head = head.next;
        }
        return false;
    }
}