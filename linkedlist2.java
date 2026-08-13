import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist2 {
    Node head; 
    int i;
    Node prev;
    public void addfirst(int data){
        //if(head == null ){
          //  System.out.println("list is not created");
       // }
        Node newNode= new Node(data);
         newNode.next=head;
         head = newNode;
         System.out.println("list is creat");

        }
    // Insert at end
    public void add(int data) {
        
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;

        }
        // insert at position
     public void insertAtposition(int pos,int data){
       // Node head;
        Node newNode = new Node(data);

        if(head==null){
            System.out.println("list is not created");
            return;
        }
        
         // Node newNode = new Node(data);
          Scanner scanner = new Scanner(System.in);

          System.out.println("enter your position");
          pos = scanner.nextInt();

          System.out.println("enter your data");
          data = scanner.nextInt(); 

          Node temp = head;
          Node prev = temp;
          //Node next = temp.next;
            if(pos==0){
                newNode.next=head;
                head= newNode;
                return;
            }
            for( i=0;i<=pos;i++){
                temp =temp.next;
            }
               // newNode.next=temp;
                prev.next=newNode;
                newNode.next=temp;         
        }
        public void deletefirst(){
            if(head==null){
                System.out.println("list is not created");
                return;
            }
            head = head.next;
            System.out.println("first node is deleted");
        }
        public void deleteatend(){
            if(head==null){
                System.out.println("list is not created");
            }
            Node temp = head;
           
            while(temp.next.next!=null){
                temp=temp.next;
                
            }
            temp.next = null;
            System.out.println("last node is deleted");

            System.out.println("deleted node is = "+temp.data);
        }
        public void deleteatposition(int pos){
            if(head==null){
                System.out.println("list is not created");
                return;
            }
            Node temp = head;
            Node prev = temp;
            if(pos==0){
                head = temp.next;
                return;
            }
            for(i=0;i<=pos;i++){
                temp = temp.next;
            }
            prev.next=temp.next;
        }   
      //display
    public void display() {
        Node temp = head;
        if(head==null)
            System.out.println("list is empty");
        //Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist2 list = new linkedlist2();
        list.addfirst(55);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        //list.deletefirst();
        list.deleteatend();
        //list.insertAtposition(40,3);
        //list.insertAtposition(45,4);
        list.display();
    }
}