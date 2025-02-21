package PERTEMUAN3;

public class node {
    private int data;
    private node next;

     // inisialisasi Atribut Node
     public node (int data) {
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
    public void setNext(node next){
        this.next = next;
    }

    public node getNext() {
        return next;
    }
    
    
}
