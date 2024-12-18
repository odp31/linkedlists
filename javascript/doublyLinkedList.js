class Node {
  constructor(data) {
    this.data = data;
    this.prev = null;
    this.next = null;
  }
}

class DoublyLinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
  }
  isEmpty() {
    return this.head === null;
  }
  addToHead(data) {
    const newNode = new Node(data);
    if(this.isEmpty()) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      newNode.next = this.head;
      this.head.prev = newNode;
      this.head = newNode;
    }
  }

  addToTail(data) {
    const newNode = new Node(data);
    if(this.isEmpty()) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.tail.next = newNode;
      newNode.prev = this.tail;
      this.tail = newNode;
    }
  }

  deleteHead() {
    if(this.isEmpty()) {
      return;
    }
    if(this.head === this.tail) {
      this.head = null;
      this.tail = null;
    } else {
      this.head = this.head.next;
      this.head.prev = null;
    }
  }

  deleteTail() {
    if(this.isEmpty()) {
      return;
    }
    if(this.head === this.tail) {
      this.head = null;
      this.tail = null;
    } else {
      this.tail = this.tail.prev;
      this.tail.next = null;
    }
  }

  printList() {
    if(this.isEmpty()) {
      console.log("list is empty");
      return;
    }
    let current = this.head;
    while(current) {
      console.log(current.data);
      current = current.next;
    }
  }
}
