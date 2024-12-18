class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class CircularLinkedList {
  constructor() {
    this.head = null;
  }
  isEmpty() {
    return this.head === null;
  }
  add(data) {
    const newNode = new Node(data);
    if(this.isEmpty()) {
      this.head = newNode;
      newNode.next = newNode;
    } else {
      let current = this.head;
      while(current.next !=== this.head) {
        current = current.next;
      }
      current.next = newNode;
      newNode.next = this.head;
    }
  }

  delete(data) {
    if(this.isEmpty()) {
      return;
    }
    let current = this.head, prev = null;
    if(current.data === data) {
      if(current.next === current) {
        this.head = null;
      } else {
        while(current.next !== this.head) {
          current = current.next;
        }
        current.next = this.head.next;
        this.head = this.head.next;
      }
      return;
    }
    while(current.next !== this.head && current.next.data !== data) {
      current = current.next;
    }
    if(current.next.data === data) {
      current.next = current.next.next;
    }
  }

  printList() {
    if(this.isEmpty()) {
      console.log("list is empty");
      return;
    }
    let current = this.head;
    do {
      console.log(current.data);
      current = current.next;
    } while (current !== this.head);
  }
}
