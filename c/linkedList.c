#include <stdio.h>
#include <stdlib.h>

// define node structure
struct Node {
  int data;
  struct Node* next;
};

// function to create a new node 
struct Node* createNode(int data) {
  struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
  newNode->data = data;
  newNode->next = NULL;
  return newNode;
}

// function to insert a node at beginning 
void insertAtBeginning(struct Node** head, int data) {
  struct Node* newNode = createNode(data);
  newNode->next = *head;
  *head = newNode;
}

// function to print linked list
void printList(struct Node* head) {
  struct Node* temp = head;
  while(temp != NULL) {
    printf("%d -> ", temp->data);
    temp = temp->next;
  }
  printf("NULL\n");
}

// main function to test linked list
int main() {
  struct Node* head = NULL;

  insertAtBeginning(&head, 10);
  insertAtBeginning(&head, 20);
  insertAtBeginning(&head, 30);

  printf("linked list: ");
  printList(head);
  return 0;
}

