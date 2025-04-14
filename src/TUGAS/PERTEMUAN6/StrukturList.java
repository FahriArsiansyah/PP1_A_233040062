package PERTEMUAN6;

public class StrukturList {
  public node HEAD;

  public boolean isEmpty() {
    return HEAD == null;
  }

  // ADD TAIL
  public void addTail(int data) {
    node posNode = null, curNode = null;

    node newNode = new node(data);
    if (isEmpty()) {

      HEAD = newNode;
    } else {
      curNode = HEAD;
      while (curNode != null) {
        posNode = curNode;
        curNode = curNode.getNext();
      }
      posNode.setNext(newNode);
    }
  }

  // display
  public void displayElement() {
    node curNode = HEAD;
    while (curNode != null) {
      System.out.print(curNode.getData() + "");
      curNode = curNode.getNext();
    }
  }

  // ADD HEAD
  public void addHead(int data) {
    node newNode = new node(data);
    if (isEmpty()) {
      HEAD = newNode;
    } else {
      newNode.setNext(HEAD);
      HEAD = newNode;
    }
  }

  // ADD MID
  public void addMid(int data, int position) {
    node posNode = null, curNode = null;
    node newNode = new node(data);
    if (HEAD == null) {
      HEAD = newNode;
      return;
    } else {
      curNode = HEAD;
      if (position == 1) {
        newNode.setNext(HEAD);
        HEAD = newNode;

      } else {
        int i = 1;
        while (curNode != null && i < position) {
          posNode = curNode;
          curNode = curNode.getNext();
          i++;
        }
      }
      posNode.setNext(newNode);
      newNode.setNext(curNode);
    }
  }

  // REMOVE HEAD
  public void removeHead() {
    if (isEmpty()) {
      System.out.println("List Kosong");
    } else {
      node temp = HEAD;
      HEAD = HEAD.getNext();
      dispose(temp);
    }
  }

  private void dispose(node temp) {
    temp.setNext(null);
    temp = null;
  }

  // REMOVE TAIL
  public void removeTail() {
    if (!isEmpty()) { // <-- ubah menjadi if (!isEmpty()) agar logika benar
      if (HEAD.getNext() == null) {
        node temp = HEAD;
        HEAD = null;
        dispose(temp); // <- tambahkan ini agar konsisten
      } else {
        node lastNode = HEAD;
        node preNode = null;
        while (lastNode.getNext() != null) {
          preNode = lastNode;
          lastNode = lastNode.getNext();
        }
        preNode.setNext(null);
        dispose(lastNode);
      }
    }
  }

  // REMOVE MID
  public void removeMid(int e) {
    node preNode = new node(0);
    node tempNode;
    int i;
    boolean ketemu;

    if (isEmpty()) {
      System.out.println("Elemen list kosong");
    } else {
      ketemu = false;
      i = 1;
      tempNode = HEAD;
      while (tempNode.getNext() != null && !ketemu) {
        if (tempNode.getNilai() == e) {
          ketemu = true;
        } else {
          preNode = tempNode;
          tempNode = tempNode.getNext();
          i++;
        }
      }

      if (ketemu == true) {
        if (i == 1)
          HEAD = null;
        else {
          preNode.setNext(tempNode.getNext());
          dispose(tempNode);
        }
      }
    }
  }

}