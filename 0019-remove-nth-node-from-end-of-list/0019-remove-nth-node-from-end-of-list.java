
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        ListNode First = dummy;
        ListNode Second = dummy;
        dummy.next=head;
        for(int i=0;i<=n;i++){
            First=First.next;
            
        }
        while(First!=null){
            Second=Second.next;
            First=First.next;
            

        }
        Second.next=Second.next.next;
        return dummy.next;

        
    }

}