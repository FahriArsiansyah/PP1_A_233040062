package PERTEMUAN5;

import PERTEMUAN3.Node;

public class StrukturList {
  public Node HEAD;

  public boolean isEmpty() {
    return HEAD == null;
  }

  // ADD TAIL
  public void addTail(int data) {
    Node posNode = null, curNode = null;

    Node newNode = new Node(data);
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

  // display
  public void displayElement() {
    Node curNode = HEAD;
    while (curNode != null) {
      System.out.print(curNode.getData() + "");
      curNode = curNode.getNext();
    }
  }

  // ADD HEAD
  public void addHead(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      HEAD = newNode;
    } else {
      newNode.setNext(HEAD);
      HEAD = newNode;
    }
  }

  // REMOVE HEAD
  public void removeHead() {
    if (isEmpty()) {
      System.out.println("List Kosong");
    } else {
      Node temp = HEAD;
      HEAD = HEAD.getNext();
      dispose(temp);
    }
  }

  private void dispose(Node temp) {
    temp.setNext(null);
    temp = null;
  }

  // REMOVE TAIL
  public void removeTail() {
    if (!isEmpty()) { // <-- ubah menjadi if (!isEmpty()) agar logika benar
      if (HEAD.getNext() == null) {
        Node temp = HEAD;
        HEAD = null;
        dispose(temp); // <- tambahkan ini agar konsisten
      } else {
        Node lastNode = HEAD;
        Node preNode = null;
        while (lastNode.getNext() != null) {
          preNode = lastNode;
          lastNode = lastNode.getNext();
        }
        preNode.setNext(null);
        dispose(lastNode);
      }
    }
  }

}