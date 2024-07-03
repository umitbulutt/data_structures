package LinkedListPractice;

public class StringReferencingTest {
    public static void main(String[] args) {

        Car car1 =  new Car("BMW",2020);
        Car car2 =  new Car("BMW",2024);
        Car car3 =  new Car("BMW",2024);

        car1.next = car2;
        car2.next = car3;
        System.out.println(car1);
        System.out.println(car1.next);
        System.out.println(car2);
        System.out.println(car2.next);



    }
}
