package main.java;

public class MyStack<T> {

    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    public boolean isEmpty(){
        return bottom==top;
    }

    public void push(T item){
        SNode<T> node = new SNode<>(item);
        if(isEmpty()) bottom =top = node;
        else{
            top.next=node;
            top=node;
        }
        size++;
    }





}
