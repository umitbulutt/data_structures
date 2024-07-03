package LinkedListPractice;

public class UserLinkedList {
    User head;
    User tail;
    int size;  //this will hold the number of the elements

    public UserLinkedList(){
        this.head =null;
        this.tail = null;
        size = 0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void insertLast(User newNode){
        //2 cases  1: List is empty;
        if (isEmpty()){
            head =tail = newNode;
        }        //2. case : List is not empty;
        else{

            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

}
