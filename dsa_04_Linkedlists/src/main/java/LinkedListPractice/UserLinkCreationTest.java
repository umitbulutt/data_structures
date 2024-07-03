package LinkedListPractice;

public class UserLinkCreationTest {

    public static void main(String[] args) {

        UserLinkedList list = new UserLinkedList();
        list.insertLast(new User("Austin","AAA"));
        list.insertLast(new User("Jack","Reacher"));
        list.insertLast(new User("Carol","Reacher3"));
        list.printNames();

        list.get(2);








    }

}
