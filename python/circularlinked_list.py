class Node:
  def __init__(self, data):
    self.data = data
    self.next = None


class CircularLinkedList:
  def __init__(self):
    self.head = None

  def insert_at_end(self, data):
    new_node = Node(data)
    if not self.head:
      self.head = new_node
      new_node.next = self.head
    else:
      temp = self.head
      while temp.next != self.head:
        temp = temp.next
      temp.next = new_node
      new_node.next = self.head

  def print_list(self):
    if not self.head:
      return
    temp = self.head
    while True:
      print(temp.data, end=" -> ")
      temp = temp.next
      if temp == self.head:
        break
    print("(head)")


# example usage
if __name__ == "__main__":
  cl1 = CircularLinkedList()
  cl1.insert_at_end(10)
  cl1.insert_at_end(20)
  cl1.insert_at_end(30)

  print("circular linked list; ")
  cl1.print_list() 
