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
 import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode>arr=new ArrayList<>();
        while(head!=null){
            arr.add(head);
            head=head.next;
        }
        ListNode a=new ListNode(0);
        ListNode b= a;
        for(int i=arr.size()-1;i>=0;i--){
            a.next=arr.get(i);
            a=a.next;
        }
        a.next=null;
        return b.next;
        
    }
}