package PERTEMUAN6;

public class StrukturListTest {
    public static void main(String[] args) {
      StrukturList list = new StrukturList();
      list.addMid(2, 1);
      list.addMid(6, 2);
      list.addMid(3, 3);
      list.addMid(5, 4);
      list.addMid(1, 5);
  
      System.out.println("Elemen: ");
      list.displayElement();
  
      list.removeMid(3);
      list.removeMid(6);
      list.removeMid(5);
      System.out.println("\nSetelah dihapus: ");
      list.displayElement();
    }
  }