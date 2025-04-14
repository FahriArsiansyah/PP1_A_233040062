package PERTEMUAN5;

public class StrukturListTest {

  public static void main(String[] args) {
    StrukturList list = new StrukturList();
    // REMOVE HEAD
    // list.addHead(2);
    // list.addHead(9);
    // list.addHead(7);

    // System.out.println("Elemen: ");
    // list.displayElement();

    // list.removeHead();
    // System.out.println("\nSetelah dihapus: ");
    // list.displayElement();

    // REMOVE TAIL
    list.addTail(2);
    list.addTail(6);
    list.addTail(3);
    list.addTail(5);
    list.addTail(1);

    System.out.println("Elemen: ");
    list.displayElement();

    list.removeTail();
    System.out.println("\nSetelah dihapus: ");
    list.displayElement();

    list.removeHead();
    System.out.println("\nSetelah dihapus 2: ");
    list.displayElement();

    list.removeTail();
    System.out.println("\nSetelah dihapus 3: ");
    list.displayElement();
  }

}