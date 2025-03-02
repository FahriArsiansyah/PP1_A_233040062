package PERTEMUAN3;

public class strukturList {
    private Node HEAD;
    
    public boolean isEmpty() {
        return HEAD == null;
    }

    // Add Tail
    public void addTail(int data){
        Node posNode = null, currNode = null;

        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }

        else{
            currNode = HEAD;
            while (currNode != null){
                posNode = currNode;
                currNode = currNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    // Display
    public void displayElement() {
        Node curNode = HEAD;
        while(curNode != null) {
            System.out.printf(curNode.getData()+ "");
            curNode = curNode.getNext(); 
        }
    }

    
    // Add HEAD
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
}

    