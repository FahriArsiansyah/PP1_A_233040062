package PERTEMUAN8.latihan;
import java.util.regex.MatchResult;

public class StrukturList {
  public node HEAD;

  public boolean isEmpty() {
    return HEAD == null;
  }

  // ADD TAIL
  public void addTail(Matakuliah data) {
    node posNode = null, curNode = null;

    node newNode = new node(data);
    if (isEmpty()) {

      HEAD = newNode;
    } else {
      curNode = HEAD;
      while (curNode != null) {
        posNode = curNode;
        curNode = curNode.getNext();
      }
      posNode.setNext(newNode);
    }
  }

  // Display
  public void displayElement() {
    if (isEmpty()) {
      System.out.println("List Kosong");
    } else {
      node curNode = HEAD;
      while (curNode != null) {
        System.out.println(
            "Matakuliah :" + curNode.getdata().getKode() + " " + curNode.getdata().getNama() + ","
                + curNode.getdata().getSks());
        curNode = curNode.getNext();
      }
    }
  }

  // ADD HEAD
  public void addHead(Matakuliah data) {
    node newNode = new node(data);
    if (isEmpty()) {
      HEAD = newNode;
    } else {
      newNode.setNext(HEAD);
      HEAD = newNode;
    }
  }

  // ADD MID
  public void addMid(Matakuliah data, int position) {
    node posNode = null, curNode = null;
    node newNode = new node(data);
    if (HEAD == null) {
      HEAD = newNode;
      return;
    } else {
      curNode = HEAD;
      if (position == 1) {
        newNode.setNext(HEAD);
        HEAD = newNode;

      } else {
        int i = 1;
        while (curNode != null && i < position) {
          posNode = curNode;
          curNode = curNode.getNext();
          i++;
        }
      }
      posNode.setNext(newNode);
      newNode.setNext(curNode);
    }
  }

}

