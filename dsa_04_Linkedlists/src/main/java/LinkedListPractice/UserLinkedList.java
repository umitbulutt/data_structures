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
    void printNames(){
        if (isEmpty()) System.out.println("List is empty");

        User current = head;
        while(current!=null){
            System.out.println(current.name );
            current = current.next;
        }
    }
    User get(int index){
        if (index>=size){
            System.out.println("Index out of bounds");
            return null;
        }else{
        User current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
            }
        }

        void deleteByName(String name){
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        User prev=head;
        User current =head;
        while(current!=null){
            if (current.name.equals(name)){
                //we have 3 cases
                // case 1 = head
                if (current==head){
                    if (head==tail) tail = null; // if there is one element
                     head = current.next;
                     current.next = null;
                }
                //case 2 : tail
                else if(current==tail){
                    prev.next = null;
                    tail = prev;
                }

                //case 3: middle
                else{
                    prev.next = current.next;
                    current.next =null;

                }
                size--;
            }
            prev = current;
            current =current.next;

        }


        }



    }


