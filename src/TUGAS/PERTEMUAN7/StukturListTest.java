package PERTEMUAN7;

public class StukturListTest {
    public static void main(String[] args) {
        // Latihan 2
        StukturList list = new StukturList();
        list.addTail(5);
        list.addTail(4);
        list.addTail(6);
        list.printList();                   // Output: 5 4 6
        System.out.println(list.find(6)); 

        // Latihan 4
        StukturList list2 = new StukturList();
        list2.addTail(7);
        list2.addTail(6);
        list2.addTail(4);
        list2.addTail(2);
        list2.addTail(3);
        list2.printList();                  
        System.out.println(list2.size());   
    }
}