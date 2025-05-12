package PERTEMUAN8.latihan;

public class node {
  private Matakuliah data;
  private node next;

  // Inisialisasi atribut node

  public node(Matakuliah data) {
    this.data = data;
    this.next = null;
  }

  // Setter & Getter
  public void setData(Matakuliah data) {
    this.data = data;
  }

  public Matakuliah getdata() {
    return data;
  }

  // Setter & Getter untuk Next
  public void setNext(node next) {
    this.next = next;
  }

  public node getNext() {
    return next;
  }
}