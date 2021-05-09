public class SortingInSLinkedList {
    class Node{
        int data ;
        Node next;

        Node(int data){
            this.data= data;
        }
    }

    public Node head = null;
    public Node tail = null;

    //addNode function
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
        }else{
            tail.next = newNode;
        }

        tail = newNode;
    }

    //display Elements
    public void display(){
        if(head == null){
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


    //sort
    public void sortList(){
        Node current = head , index = null;
        int temp;

        if(head == null){
            return;
        }else{
            while(current != null){
                //node index will point to node next to
                //current
                index = current.next;

                while(index != null){
                    if(current.data>index.data){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    //main function
    public static void main(String[] args) {
        SortingInSLinkedList list = new SortingInSLinkedList();

        list.addNode(43);
        list.addNode(22);
        list.addNode(9);
        list.addNode(18);
        list.addNode(32);

        list.display();

        list.sortList();
        list.display();
    }
}
