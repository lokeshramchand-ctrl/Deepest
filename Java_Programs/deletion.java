import java.util.List;

public class deletion {
public List removeNthFromEnd(Listnode head, int n) {
        // Store head node
        Listnode temp = head, prev = null;
        // If head node itself holds the key to be deleted
        if (temp != null && temp.val == n) {
            head = temp.next; // Changed head
            return null;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.val != n) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return null;

        // Unlink the node from linked list
        prev.next = temp.next;
    
    return head;
}
public static void main(String[] args) {
    
}
}
