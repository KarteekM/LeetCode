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
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        
       ListNode currNode = head;
       ListNode prev = head;     
            
     
        
        while(head!= null && head.val == val){
            head = head.next;
        }
        
           if( null == head){
            return null;
        }       
        
        while(currNode != null){
            
            if(currNode.val == val){                
                while(currNode != null && currNode.val == val){
                    currNode = currNode.next;
                }              
                
                
                prev.next = currNode;                
            }
            
            else{
                prev= currNode;
                currNode = currNode.next;
            }
            
        }     
       
        return head;
        
    }
}