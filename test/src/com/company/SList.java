package com.company;

//From IntList to SList
public class SList {
    public class IntNode{
        int head;
        IntNode tail;
        public IntNode(int h, IntNode t){
            head=h;
            tail=t;
        }
    }

    public IntNode front;
    public SList(int x){
        front=new IntNode(x,null);
    }
    public void addFront(int x){
        IntNode oldFront=front;
        front=new IntNode(x, oldFront);
    }

    }

