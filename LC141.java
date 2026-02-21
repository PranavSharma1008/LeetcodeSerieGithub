
// Ques Name - Linkedlist Contains a cycle or not


so basically we move the pointer from start of the head of the ll both slow and fast and move slow to one step
and fast to 2 steps whenever they match mean cycle exist


Youtube Vedio Link -   
  

  // approch name Tortoise and Hare algorithm (Floyd's Cycle Detection)
  
public class Solution {
    public boolean hasCycle(ListNode head) {
        
      ListNode slow = head;
      ListNode fast = head;

      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast = fast.next.next;

        if(slow == fast) return true;
      }  
    return false;
    }
}
