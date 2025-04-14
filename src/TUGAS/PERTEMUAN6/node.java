package PERTEMUAN6;

public class node {
  private int data;
  private node next;

  // inisiai node
  public node(int data) {
    this.data = data;
  }

  // setter dan getter
  public void setNext(node next) {
    this.next = next;
  }

  public node getNext() {
    return this.next;
  }

  public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public int getNilai() {
    return this.data;
  }
}