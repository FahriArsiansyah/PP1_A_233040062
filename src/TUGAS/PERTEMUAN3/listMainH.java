package PERTEMUAN3;

public class listMainH {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        list.addHead(1);
        list.addHead(4);
        list.addHead(5);
        list.addHead(7);
        
        System.out.println("Elemen: ");
        list.displayElement();
    }
}

