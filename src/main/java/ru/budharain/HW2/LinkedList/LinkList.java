package ru.budharain.HW2.LinkedList;

public class LinkList {
    private Node head;
    private Node tail;

    public LinkList(){
        head=null;
        tail=null;
    }
    private boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            tail=temp;
        }else
            head.prev = temp;
        temp.next = head;
        head = temp;
    }
    public void addLast(int data){
        Node temp = new Node(data);
        if(isEmpty()) {
            head = temp;
        }else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;
    }
    public void deleteFirst(){
        if(head.next == null){
            tail = null;
        }else
            head.next.prev = null;
        head = head.next;
    }
    public void deleteLast(){
        if(head.next == null){
            head = null;
        }else
            tail.prev.next = null;
        tail = tail.next;
    }
    public void deleteAt(int key){
        Node cur = head;
        while (cur.data != key){
            cur = cur.next;

            if (cur ==null)
                return;
        }
        if(cur == head)
            deleteFirst();
        else
            cur.prev.next = cur.next;

        if(cur == tail)
            deleteLast();
        else
            cur.next.prev = cur.prev;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
