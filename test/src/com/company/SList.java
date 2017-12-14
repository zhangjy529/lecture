package com.company;

//From IntList to SList
// Modified to generic SList
public class SList<Bleep> {
    public class Node{
        Bleep head;
        Node tail;
        public Node(Bleep h, Node t){
            head=h;
            tail=t;
        }
    }

    private Node sentinel;
    private int size;

    //sentinel with one element x
    public SList(Bleep x){
        sentinel=new Node(null,null);
        sentinel.tail=new Node(x, null);
        size=1;
    }
    //Create an empty list
    public SList(){
        sentinel=new Node(null, null);
        size=0;
    }

    public void insertBack(Bleep x){
        Node p=sentinel;
        while(p.tail!=null){
            p=p.tail;
        }
        p.tail=new Node(x,null);
        size+=1;
    }

    public void addFront(Bleep x){
        Node oldFront=sentinel.tail;
        Node newFront=new Node(x, oldFront);
        sentinel.tail=newFront;
        size=size+1;
    }

    public Bleep getFront(){
        return sentinel.tail.head;
    }

    //Return the back node of our list
    private Node getBackNode(){
        Node p=sentinel;
        while(p.tail!=null){
            p=p.tail;
        }
        return p;
    }

    public Bleep getBack(){
        Node back=getBackNode();
        return back.head;
    }

    //this is non-static method which should run together with the instance name front
    public int size(){
        return size;
    }

    public static void main(String[] args){
        SList s1 = new SList<Integer>(5);
        s1.addFront(10);
        s1.addFront(15);
        System.out.println(s1.getFront());
        System.out.println(s1.size());
        System.out.println(s1.size);
        System.out.println(s1.getBack());
        SList s2=new SList<String>("a");
        s2.addFront("b");
        s2.addFront("c");
        System.out.println(s2.getFront());
        System.out.println(s2.size());
        System.out.println(s2.getBack());
    }

    }

