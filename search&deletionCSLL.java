class node {
  int data;
  Node next;
}

class LinkedList{
  Node head;
  
  LinkedList(){
    head = null;
  }

   //Add new element at the start of the list
  void InsertFirst(int newElement) {
    Node newNode = new Node();
    newNode.data = newElement;
    newNode.next = null;
    if(head == null) {
      head = newNode;
      newNode.next = head;
    } else {
      Node temp = new Node();
      temp = head;
      while(temp.next != head)
        temp = temp.next;
      temp.next = newNode;
      newNode.next = head;
      head = newNode;
    }    
  }
 
  //Add new element at the end of the list
  void InsertLast(int newElement) {
    Node newNode = new Node();
    newNode.data = newElement;
    newNode.next = null;
    if(head == null) {
      head = newNode;
      newNode.next = head;
    } else {
      Node temp = new Node();
      temp = head;
      while(temp.next != head)
        temp = temp.next;
      temp.next = newNode;
      newNode.next = head;
    }    
  }
 
  //Inserts a new element at the given position
  void InsertAt(int newElement, int position) {  
    Node newNode = new Node();
    newNode.data = newElement;
    newNode.next = null;
    Node temp = head;
    int NoOfElements = 0;
 
    if(temp != null) {
      NoOfElements++;
      temp = temp.next;
    }
    while(temp != head) {
      NoOfElements++;
      temp = temp.next;
    }
 
    if(position < 1 || position > (NoOfElements+1)) {
      System.out.print("\nInvalid position.");
    } else if (position == 1) {
 
      if(head == null) {
        head = newNode;
        head.next = head;
      } else {
        while(temp.next != head) {
          temp = temp.next;
        }
        newNode.next = head;
        head = newNode;
        temp.next = head;
      }
    } else {
      temp = head;
      for(int i = 1; i < position-1; i++)
        temp = temp.next;
      newNode.next = temp.next;
      temp.next = newNode;  
    }
  }
 
  //display the content of the list
  void Display() {
    Node temp = new Node();
    temp = this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(true) {
        System.out.print(temp.data + " ");
        temp = temp.next;
        if(temp == this.head)
          break;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  }    
};
 
// test the code
public class Insertion_CSLL {
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();
 
    //Add three elements at the start of the list.
    MyList.InsertFirst(10);
    MyList.InsertFirst(20);
    MyList.InsertFirst(30);
 
//Add three elements at the end of the list.
    MyList.InsertLast(10);
    MyList.InsertLast(20);
    MyList.InsertLast(30);
    MyList.Display();
 
    //Insert an element at position 2
    MyList.InsertAt(100, 2);
    MyList.Display();
 
    MyList.Display();
  }
}

  
  
  
