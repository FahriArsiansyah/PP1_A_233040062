package PERTEMUAN4.Tugas;

public class StrukturListTes {
    public static void main(String[] args) {
      StrukturList list = new StrukturList();
      list.addTail(2.1);
      list.addTail(5.5);
      list.addMid(4.5, 2);
      list.addMid(1.1, 2);
      list.addHead(3.4);
  
      list.displayElement();
  
      //list.addTail(3.4);
      //list.addMid(4.5, 2);
      //list.addHead(2.1);
  
      //list.displayElement();
    }
  
  }