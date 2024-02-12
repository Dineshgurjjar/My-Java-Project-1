public class LinkedList {
    Node head;
    private int size;
    LinkedList(){
    size=0;    
    }
public class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
        size++;
    }   
}
public void addFirst(String data){
    Node newNode = new Node(data);
    // if(head == null){
    //      head = newNode;
    // }
    newNode.next = head;
    head = newNode;
}
public void  addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
        head= newNode;
        return;
    }
    Node LastNode = head;
    while (LastNode.next != null) {
        LastNode = LastNode.next;                
    }
    LastNode.next = newNode;
}
public  void removeFirst(){
    if(head == null){
        System.out.println("Empty list ,nothing to delete");
        return;
    }
    head=this.head.next;
    size--;
}

public  void removeLast(){
    if(head == null){
        System.out.println("Empty list ,nothing to delete");
        return;
    }
    size--;
    if(head.next == null){
        head = null;
        return;
    }
    Node currNode = head;
    Node lastNode = head.next;
    while(lastNode.next != null){
        currNode = currNode.next;
        lastNode = lastNode.next;
    }
    currNode.next = null;  
}
public  int getsize(){
    return size;
}
public void printLL(){
    if(head == null){
        System.out.println("List is Empty");
        return; 
       }
       Node temp = head;
       while (temp != null) {
        System.out.print(temp.data + "-->");
        temp = temp.next;
       }
       System.out.println("null");
}
public void addInMiddle(int index,String data){
    if(index>size||index<0){
        System.out.println("Invalid Index value");
        return;
    }
    size++;
    Node newNode = new Node(data);
    if(head == null|| index ==0){
        newNode.next = head;
        head = newNode;
        return ;
    }
    Node currNode = head;
    for (int i=1;i<size;i++){
        if(i==index){
            Node nextNode = currNode.next;
            currNode.next = newNode;
            newNode.next = nextNode;
            break;
        }
        currNode = currNode.next;
    }
}
public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addFirst("A");
    list.addFirst("Gurjar");
    list.addFirst("Dinesh");
    list.addFirst("The");
    list.printLL();
    list.addLast("good");
    list.addLast("boy");
    // list.removeFirst();
    // list.printLL();
    // list.removeLast();
     list.addInMiddle(3,"is");
    list.printLL();
    System.out.println("Size of the linkedlist : "+list.getsize());
  
    
}

}
