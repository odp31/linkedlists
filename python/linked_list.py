class Node:
  def __init__(self, data):
    self.data = data
    self.next = None

class LinkedList:
  def __init__(self):
    self.head = None


  def insert_at_beginning(self, data):
    new_node = Node(data)
    new_node.next = self.head
    self.head = new_node

  def print_list(self):
    temp = self.head
    while temp:
      print(temp.data, end=" ->")
      temp = temp.next
    print("None")


# example usage
if __name__ == "__main__":
  l1 = LinkedList()
  l1.insert_at_beginning(10)
  l1.insert_at_beginning(20)
  l1.insert_at_beginning(30)

  print("linked list; ")
  l1.print_list()
