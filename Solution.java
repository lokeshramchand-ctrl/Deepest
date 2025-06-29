import java.util.HashSet;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode curr = head;
        HashSet<Integer> hehe = new HashSet<>();
        for (int num : nums) {
            hehe.add(num);  
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (curr != null) {
            if (!hehe.contains(curr.val)) {
                tail.next = new ListNode(curr.val);
                tail = tail.next;
            
    }
} 
    }
}

