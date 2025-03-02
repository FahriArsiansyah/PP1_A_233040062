package PERTEMUAN3;

public class Node {
    private int data;
    private Node next;

     // inisialisasi Atribut Node
     public Node (int data) {
        this.data = data;
    }

    // Setter & Getter
    public void Setnilai (int data) {
        this.data = data;
    }
    
    public int getData() {
        return data;
    }

    // Setter & Getter untuk Next
    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
    
    
}
