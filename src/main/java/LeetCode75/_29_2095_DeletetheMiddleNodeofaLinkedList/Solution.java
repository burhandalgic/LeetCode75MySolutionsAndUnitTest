package LeetCode75._29_2095_DeletetheMiddleNodeofaLinkedList;
public class Solution {


    public ListNode deleteMiddle(ListNode head) {
        int count =0;
        ListNode node=head;
        while(node!=null){
            node=node.next;
            count++;
        }if(count==1){
            return null;
        }
        node=head;
        for(int i=0;i<(count/2)-1;i++){
            node =node.next;
        }
        node.next=node.next.next;
        return head;
    }

}
