public class Queue {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node front;
    public Node rear;

    public void enqueue(int data){
        Node node = new Node(data);
        
        if(rear == null){
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
        
    }

    public void dequeue(){
    
        if(front ==null){
            System.out.println("Empty");
            return;
        }
        front = front.next;

        if(front == null){
            rear = null;
        }

        
    }

    public void display(){
        Node current = front;

        if(front == null){
            System.out.println("List is empty");
            return;
        }

        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("\n");

        
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();

        queue.display();
       
    }
}
