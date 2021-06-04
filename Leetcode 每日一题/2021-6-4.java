/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointer = headA;
        int cntA = 0;
        while(pointer != null){
           cntA++;
           pointer = pointer.next; 
        }
        pointer = headB;

        int cntB = 0;
        while(pointer != null){
           cntB++;
           pointer = pointer.next; 
        }
        ListNode pointer_sub;
        if(cntA > cntB){
            pointer = headA; 
            pointer_sub = headB;
            while(cntA != cntB){
                pointer = pointer.next;
                cntA--;
            }
        } else {
            pointer = headB;
            pointer_sub = headA;
            while(cntA != cntB){
                pointer = pointer.next;
                cntB--;
            }
        }

        while(pointer != null){
            if(pointer == pointer_sub){
                return pointer;
            }
            pointer = pointer.next;
            pointer_sub = pointer_sub.next;
        }
        return null;
    }
}