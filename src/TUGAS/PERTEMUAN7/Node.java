package PERTEMUAN7;

public class Node {
    private int data;
    private Node next;
    // inisialisasi Node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
 
    public void setNilai(int data){
        this.data = data;
    }
    public int getdata () {
        return data;
    }
    // Setter & Getter
    public void setNext(Node next) { 
        this.next= next;
    }
 
    public Node getNext() { 
        return next;
     }
}