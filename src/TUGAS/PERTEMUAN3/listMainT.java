package PERTEMUAN3;

public class listMainT {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        list.addTail(1);
        list.addTail(4);
        list.addTail(5);
        list.addTail(7);
        
        System.out.println("Elemen: ");
        list.displayElement();
    }
}
