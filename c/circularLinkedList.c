#include <stdio.h>
#include <stdlib.h>

// define node structure
struct Node {
  int data;
  struct Node* next;
};

// function to create new node
struct Node* createNode(int data) {
  struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
  newNode->data = data;
  newNode->next = NULL:
  return newNode;
}

// function to insert a node at end 
void insertAtEnd(struct Node** head, int data) {
  struct Node* newNode = createNode(data);
  if(*head == NULL) {
    *head = newNode;
    newNode->next = *head;
  } else {
    struct Node* temp = *head; 
    while(temp->next != *head) {
      temp = temp->next;
    }
    temp->next = newNode;
    newNode->next = *head;
  }
}

// function to print 
void printList(struct Node* head) {
  if(head == NULL) return;
  struct Node* temp = head;
  do {
    printf("%d -> ", temp->data);
    temp = temp->next;
  } while(temp != head);
  printf("(head)\n");
}

int main() {
  struct Node* head = NULL;
  insertAtEnd(&head, 10):
  insertAtEnd(&head, 20);
  insertAtEnd(&head, 30);

  printf("circular linked list; ");
  printList(head);
  return 0;
}

