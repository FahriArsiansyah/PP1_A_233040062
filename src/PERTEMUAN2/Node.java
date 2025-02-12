package PERTEMUAN2;

public class Node {
    private int nilai;
    private Node next;

    // inisialisasi Node
    public Node (int nilai) {
        this.nilai = nilai;
    }

    // Setter & Getter
    public void SetNilai (int nilai) {
        this.nilai = nilai;
    }
     
    public int getNilai () {
        return nilai;
    }

// Setter & Getter untuk next
public  void setNext (Node next ) {
    this.next = next;

} 
 
public Node getNext () {
    return next;
}
}

