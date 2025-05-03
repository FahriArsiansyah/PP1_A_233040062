package PERTEMUAN7;

public class StukturList {
    private Node head;

    public void addTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("List Kosong");
            return;
        }
        while (current != null) {
            System.out.print(current.getdata() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean find(int key) {
        Node current = head;
        while (current != null) {
            if (current.getdata() == key) return true;
            current = current.getNext();
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void clear() {
        head = null;
    }
}