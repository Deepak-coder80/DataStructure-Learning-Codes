public class SLinkedList{
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
        }
    }

    public Node head = null;
    public Node tail = null;

    //add element to linked list
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }

        tail = newNode;
    }

    //print linked list
    public void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }

        Node temp = head ;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    //insert node
    public void insert(int nextTo,int data){
        Node newNode = new Node(data);
        Node temp = head;

        while(temp != null && temp.data !=nextTo){
            
        }
    }

    //delete node
    public void delete(int data){
        Node temp = head,prev = null;
        
        if(temp != null && temp.data == data){
            head = temp.next;
            return;
        }

        while(temp !=null && temp.data != data){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        if(temp == tail){
            tail=prev;
            tail.next = null;
            return;
        }
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        

        list.addNode(10);
        list.addNode(20);
        list.addNode(50);

        list.delete(20);

        list.display();
    }
}