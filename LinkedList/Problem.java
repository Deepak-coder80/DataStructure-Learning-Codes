public class Problem {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    //add node
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }

        tail = newNode;
    }

    //dispaly nodes
    public void print(){

        Node temp = head;

        if(temp==null){
            System.out.println("Empty");
            return;
        }

        while(temp != null){
            System.out.print("-["+temp.data+"]");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    //problem solution function
    public void removeDuplicates(){
        Node current = head;

        while(current != null){
            Node next = current.next;
            while(next != null && next.data == current.data){
                next = next.next;
            }
            current.next = next;

            if(next == tail ){
                tail = current;
            }

            current = next;
        }
    }


    public static void main(String[] args) {
        Problem list = new Problem();

        list.addNode(6);
        list.addNode(10);
        list.addNode(5);
        list.addNode(5);
        list.addNode(5);
        list.addNode(8);
        list.addNode(8);

        list.print();

        list.removeDuplicates();

        list.print();
    }
}
