package PERTEMUAN7;

public class TugasStukturListTest {
    public static void main(String[] args) {
        StukturList list = new StukturList();

        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);

        System.out.println("List sebelum dihapus:");
        list.printList(); // Output: 4 3 7 8 1 9

        // Hapus semua elemen
        list.clear();

        System.out.println("List setelah dihapus:");
        list.printList(); 
    }
}