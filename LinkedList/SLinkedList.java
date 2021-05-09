import java.util.Scanner;

public class SLinkedList {
    
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

    }

    public Node head = null;
    public  Node tail = null;

    //add elements
    public void addNode(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }

        tail = newNode;
    }

    //display elements
    public void display(){
        if(head==null){
            System.out.println("Empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print("-["+temp.data+"]-");
            
            temp = temp.next;
        }
        System.out.print("\n");
    }

    //delete elements
    public void delete (int data){
        Node temp = head;
        Node prev = null;

        //check whether the list is empty or not and also check our data is equal to that 
        if(temp != null && temp.data==data){
            head = temp.next; //head is changed to the next node
            return;
        }

        while(temp != null && temp.data !=data){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        if(temp == tail){
            tail = prev;
            tail.next = null;
            return;
        }

        prev.next = temp.next;
    }

    //Insert node
    public void insertNode(int nextTo , int data){
        Node newNode = new Node(data);

        Node temp = head ;

        while(temp != null && temp.data != nextTo){
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        if(temp == tail){
            tail.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = temp.next;
        temp.next= newNode;
    }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of linked list:");
        int size = sc.nextInt();

        System.out.println("Enter elements");

        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            list.addNode(num);
        }

        

        list.display();

        System.out.println("Enter the number want to delete");
        int deleteNum=sc.nextInt();

        list.delete(deleteNum);

        list.display();

        System.out.println("Enter the number want to insert:");
        int inNum = sc.nextInt();

        System.out.println("The number Next To:");
        int nexTo = sc.nextInt();

        list.insertNode(nexTo, inNum);

        list.display();

        

        sc.close();
    }


    
}
