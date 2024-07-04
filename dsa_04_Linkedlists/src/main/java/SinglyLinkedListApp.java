import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class SinglyLinkedListApp {


    public static void main(String[] args) {
        MySinglyLinkedList mylist =new MySinglyLinkedList();
  //      mylist.add(1);
  //      mylist.add(3);
  //      mylist.add(4);
  //      mylist.printNodes();
  // //   mylist.deleteById(4);
  // //   System.out.println("---");
  // //   mylist.printNodes();
  // //   System.out.println();
  //      System.out.println(mylist.size);
  //      System.out.println("Index of 4 : " + mylist.indexOf(4));
  //      System.out.println("Index of 3 : " + mylist.indexOf(3));


        for (int i = 0; i < 10; i++) {
            mylist.add(i);
        }
        mylist.printNodes();
        System.out.println("Kth item from the last : " + mylist.getKthItemFromLast(3));
        mylist.removeKthItemFromLast(3);

        mylist.printNodes();

        mylist.addLast(10);
        mylist.printNodes();


    }
}
