class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedList {
  private Node head;

  public LinkedList() {
    head = null;
  }
  // add a new node at beginning of list
  public void addFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

// add new node at end of list 
public void addLast(int dat) {
  Node newNode = new Node(data);
  if(head == null) {
    head = newNode;
    return;
  }
  Node current = head;
  while(current.next != null) {
    current = current.next;
  }
  current.next = newNode;
}

// delete first node 
public void deleteFirst() {
  if(head == null) {
    return;
  }
  head = head.next;
}

// delete last node
public void deleteLast() {
  if(head == null || head.next == null) {
    head = null;
    return;
  }
  Node current = head;
  Node previous = null;
  while(current.next != null) {
    previous = current;
    current = current.next;
  }
  previous.next = null;
}

// print linkedlist
public void printList() {
  Node current = head;
  while(current != null) {
    System.out.print(current.data + " ");
    current = current.next;
  }
  System.out.println();
}
}

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList)_;
    list.addLast(10);
    list.addLast(20);
    list.addFirst(5);
    list.printList();
    list.deleteFirst();
    list.printlist();
  }
}
