#include <stdio.h>
#include <stdlib.h>

// define node structure
struct Node {
  int data;
  struct Node* next;
  struct Node* prev;

};

// function to create a new node
struct Node* createNode(int data) {
  struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
  newNode->data = data;
  newNode->next = NULL:
  newNode->prev = NULL;
  return newNode;
}

// function to insert node at beginning
void insertAtBeginning(struct Node** head, int data) {
  struct Node* newNode = createNode(data);
  newNode->next = *head;
  if(*head != NULL) {
    (*head)->prev = newNode;
  }
  *head = newNode;
}

// function to print linked list 
void printlist(struct Node* head) {
  struct Node* temp = head;
  while(temp != NULL) {
    printf("%d <-> ", temp-> data);
    temp = temp->next;
  }
  printf("NULL\n");
}

// main function to test doubly linked list 
int main() {
  struct Node* head = NULL;

  insertAtBeginning(&head, 10);
  insertAtBeginning(&head, 20);
  insertAtBeginning(&head, 30);

  printf("doubly linked list; ");
  printList(head);
  return 0;
}

