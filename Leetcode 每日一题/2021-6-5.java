class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode pointer = header;
        while(pointer.next != null){
            if(pointer.next.val == val){
                pointer.next = pointer.next.next;
            }else{
                pointer = pointer.next;
            }
        }
        return header.next;
    }
}