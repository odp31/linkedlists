class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
  }
  isEmpty() {
    return this.head === null;
  }
  addAtBeginning(data) {
    const newNode = new Node(data);
    newNode.next = this.head;
    this.head = newNode;
  }
  addAtEnd(data) {
    const newNode = new Node(data);
    if(this.isEmpty()) {
      this.head = newNode;
    } else {
      let current = this.head;
      while(current.next) {
        current = current.next;
      }
      current.next = newNode;
    }
  }
  deleteAtBeginning() {
    if(this.isEmpty()) {
      return;
    }
    this.head = this.head.next;
  }
  deleteAtEnd() {
    if(this.isEmpty()) {
      return;
    }
    if(this.head.next === null) {
      this.head = null;
    } else {
      let current = this.head;
      while (current.next.next) {
        current = current.next;
      }
      current.next = null;
    }
  }

  printList() {
    let current = this.head;
    while (current) {
      console.log(current.data);
      current = current.next;
    }
  }
}
