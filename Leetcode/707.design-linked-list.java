/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

// @lc code=start
class MyLinkedList {
    private class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    private int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size)
        return -1;
        Node curr = head;
        for(int i = 0 ; i < index ; i++)
        {
            curr = curr.next;
        }
        return curr.data;
    }
    
    public void addAtHead(int val) {
         Node hhe = new Node(val);
         hhe.next = head;
         head = hhe;
         size++;
    }
    
    public void addAtTail(int val) {
        Node hhe = new Node(val);
        if(head == null)
        {
            head = hhe;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = hhe;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size)
        {
            return;
        }
        if(index == 0)
        {
            addAtHead(val);
            return;
        }
        if(index == size)
        {
            addAtTail(val);
            return;
        }
        Node hhe = new Node(val);
        Node temp = head;
        for(int i = 0 ; i < index - 1 ; i++)
        {
            temp = temp.next;
        }
        hhe.next = temp.next;
        temp.next = hhe;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size)
        {
            return;
        }
        if(index ==0)
        {
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for(int i = 0 ; i < index - 1 ; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

