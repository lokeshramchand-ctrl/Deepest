public class sortLL {
    public ListNode sortList(ListNode head)
    {
        ListNode curr;
        ListNode index = null;
        int temp = 0;
        if(head == null)
        return 0;
        else
        {
            for(curr = head;curr!=null ; curr = curr.next)
            {
                for(index = curr.next ; index!=null ; index = index.next)
                {
                    if(curr.val > index.val)
                    {
                        temp = curr.val;
                        curr.val = index.val;
                        index.val = temp;
                    }
                }
            }
        }
        return head;
    }
    public static void main(String[] args) {
        
    }
}
