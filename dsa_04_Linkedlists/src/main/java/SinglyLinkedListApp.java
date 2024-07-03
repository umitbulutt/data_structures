import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class SinglyLinkedListApp {


    public static void main(String[] args) {
        MySinglyLinkedList mylist =new MySinglyLinkedList();
        mylist.add(1);
        mylist.add(3);
        mylist.add(4);
        mylist.printNodes();
   //   mylist.deleteById(4);
   //   System.out.println("---");
   //   mylist.printNodes();
   //   System.out.println();
        System.out.println(mylist.size);
        System.out.println("Index of 4 : " + mylist.indexOf(4));
        System.out.println("Index of 3 : " + mylist.indexOf(3));






    }
}
