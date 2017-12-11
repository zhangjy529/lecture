package com.company;

public class SList {
    private class SNode{
        public int item;
        public SNode next;
        public SNode(int item, SNode next){
            this.item=item;
            this.next=next;
        }
    }

    private SNode front;
    public void insertFront(int x){
        front = new SNode(x, front);
    }

    /**Insert a new element at given position. If the position is past the end of the list, insert the new node at the end of the list **/
    public void insert(int item, int position){
        //base case 1, position=0, insert at the front
        if (position==0 || front==null){
            insertFront(item);
            return;
        }
        SNode currentNode=front;
        while(position>1 && currentNode.next !=null){
            position--;
            currentNode=currentNode.next;
        }
        SNode newNode=new SNode(item, currentNode.next);
        currentNode=newNode;
    }

    // Reverse
    // Add another method to SList that reverse the elements. Do this to the existing SNodes not use new
    public void reverse(){
        //basecase,
        if (front==null || front.next==null){
            return;
        } else {
            SNode currentNode=front;
            SNode midNode=front;
            SNode newNode=currentNode;
            while (currentNode.next!=null) {
                int first = newNode.item;
                    while (newNode.next != null) {
                        newNode = newNode.next;
                    }
                int tail = newNode.item;
                newNode.item = first;
            }
        }
    }

}
