//https://leetcode.com/problems/middle-of-the-linked-list/

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
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        int n = 0;
        
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        
        temp = head;
        int z = 0;
        int m = n / 2;
        
        while (temp != null && z < m) {
            z++;
            temp = temp.next;
        }
            
        return temp;
    }
}
