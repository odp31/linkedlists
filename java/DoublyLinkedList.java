class Node {
  int data;
  Node next, prev;

  public Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

public class DoublyLinkedList {
  Node head;

  public DoublyLinkedList() {
    head = null;
  }

  // add new node at beginning
  public void addFirst(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

  // add new node at end
  public void addLast(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
    } else {
      Node last = head;
      while(last.next != null) {
        last = last.next;
      }
      last.next = newNode;
      newNode.prev = last;
    }
  }

// delete node by key
public void deleteByKey(int key) {
  Node current = head;
  if(current == null) {
    return;
  }
  if(current.data == key) {
    head = current.next;
    if(head != null) {
      head.prev = null;
    }
    return;
  }
  while(current!= null && current.data != key) {
    current = current.next;
  }
  if(current == null) {
    return;
  }
  current.prev.next = current.next;
  if(current.next != null) {
    current.next.prev = current.prev;
  }
}
// print list 
public void printList() {
  Node current = head;
  while(current != null) {
    System.out.print(current.data + " ");
    current = current.next;
  }
  System.out.println();
}
}
