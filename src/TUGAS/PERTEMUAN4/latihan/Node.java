package PERTEMUAN4.latihan;

public class Node {
  private int data;
  private Node next;

  // Inisialisasi atribut node

  public Node(int data) {
    this.data = data;
    this.next = null;

  }

  // Setter & Getter
  public void setnilai(int data) {
    this.data = data;
  }

  public int getdata() {
    return data;
  }

  // Setter & Getter untuk Next
  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

}