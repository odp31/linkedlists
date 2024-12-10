class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class CircularLinkedList {
  Node head;

  public CircularLinkedList() {
    head = null;
  }

  // insert node at beginning
  public void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      newNode.next = head;
    } else {
      Node last = head;
      while(last.next != head) {
        last = last.next;
      }
      newNode.next = head;
      last.next = newNode;
      head = newNode;
    }
  }

  // insert node at end
  public void insertAtEnd(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      newNode.next = head;
    } else {
      Node last = head;
      while(last.next != head) {
        last = last.next;
      }
      last.next = newNode;
      newNode.next = head;
    }
  }

  // delete node by key
  public void deleteByKey(int key) {
    if(head == null) {
      return;
    }
    Node prev = null;
    Node current = head;
    do {
      if(current.data == key) {
        if(prev == null) {
          if(head.next == head) {
            head = null;
          } else {
            head = current.next;
            prev = head;
            while(prev.next != current) {
              prev = prev.next;
            }
            prev.next = head;
          }
          return;
        } else {
          prev.next = current.next;
          return;
        }
      }
      prev = current;
      current = current.next;
    } while (current != head);
  }

  // print list
  public void printList() {
    if(head == null) {
      return;
    }
    Node current = head;
    do {
      System.out.println(current.data + " ");
      current = current.next;
    } while (current != head);
    System.out.println();
  }
}

