class Node:
  def __init__(self, data):
    self.data = data
    self.next = None
    self.prev = None


class DoublyLinkedList:
  def __init__(self):
    self.head = None

  def insert_at_beginning(self, data):
    new_node = Node(data)
    new_node.next = self.head
    if self.head is not None:
      self.head.prev = new_node
    self.head = new_node


  def print_list(self):
    temp = self.head
    while temp:
      print(temp.data, end=" <-> ")
      temp = temp.next
    print("none")

# example usage
if __name__ == "__main__":
  dl1 = DoublyLinkedList()
  dl1.insert_at_beginning(10)
  dl1.insert_at_beginning(20)
  dl1.insert_at_beginning(30)

  print("doubly linked list: ")
  dl1.print_list()
