package PERTEMUAN4.Tugas;

public class Node {
  private double data;
  private Node next;

  // Inisialisasi atribut node

  public Node(double data) {
    this.data = data;
    this.next = null;

  }

  // Setter & Getter
  public void setData(double data) {
    this.data = data;
  }

  public double getdata() {
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