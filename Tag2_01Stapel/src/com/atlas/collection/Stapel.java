package com.atlas.collection;

public class Stapel {

    private int data[];
    private int index;

    public Stapel() {
       this(10);
    }

    public Stapel(int groesse) {
        data = new int[groesse];
        index = 0;
    }


    public void push(int value){
        if(isFull()) return;
        data[index++] = value;
    }

    public int pop(){
        if(isEmpty()) return 0;
        return data[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == data.length;
    }
}
