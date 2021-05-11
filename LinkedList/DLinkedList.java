public class DLinkedList {
    
    class Node{
        int data;
        Node next;
        Node prev;

        Node (int data){
            this.data = data;
        }
    }

    public Node head;
    public Node tail;
    //add node
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }

        tail = newNode;
    }
    //display 
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(temp != null){
            System.out.print("-["+temp.data+"]<->");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    //display reverse

    public void revDisplay(){
        Node temp = tail;

        if(tail == null){
            System.out.println("Empty");
            return;
        }

        while(temp != null){
            System.out.print("-["+temp.data+"]<->");
            temp = temp.prev;
        }
        System.out.println("\n");
    }

    //delete a node
    public void deleteNode(int data){
        Node temp = head;

        //delete from head
        if(temp.data == data){
            head = head.next;
            head.prev = null;

            return;
        }

        //delete from tail
        if(tail.data==data){
            tail = tail.prev;
            tail.next = null;
            return;
        }

        while(temp != null){
            if(temp.data==data){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }


    }

    //insert node
    public void insertNextTo(int nextTo , int data){
        Node newNode = new Node(data);

        Node temp = head;

        if(temp == null){
            return;
        }

        if(temp == tail){
            tail.next = newNode;
            newNode.next =null;
            newNode.prev = tail;
            tail = newNode;
            return;
        }

        while(temp != null && temp.data != nextTo){
            temp = temp.next;
        }
        newNode.next = temp.next;
        
        temp.next = newNode;
        newNode.prev = temp;
    }

    

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(50);

        list.display();
       

        list.deleteNode(20);
        list.insertNextTo(50, 30);
       
        list.display();

    }
}
