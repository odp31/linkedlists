class Node {
  int data;
  Node prev, next;

  public Node(int data) {
    this.data = data;
    this.prev = this.next = null;
  }
}

class CircularDoublyLinkedList {
  Node head;

  // function to insert new node at beginning
  public void push(int data) {
    Node new_node = new Node(data);

    if(head == null) {
      head = new_node;
      new_node.next = new_node;
      new_node.prev = new_node;
    } else {
      new_node.next = head;
      new_node.prev = head.prev;
      head.prev.next = new_node;
      head.prev = new_node;
      head = new_node;
    }
  }

  // function to delete a node
  public void deleteNode(Node del_node) {
    if(head == null || del_node == null) {
      return;
    }
    if(head == del_node) {
      head = del_node.next;
    }
    del_node.prev.next = del_node.next;
    del_node.next.prev = del_node.prev;
  }

  // function to print list
  public void printList() {
    if(head == null) {
      System.out.println("list is empty");
      return;
    }
    Node curr = head;
    do {
      System.out.print(curr.data + " ");
      curr = curr.next;
    } while (curr != head);
    System.out.println();
  }
}
