public class Stack {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node top;

    public void push(int data){
        Node node = new Node(data);

        if(top == null){
            top = node;
        }else{
            node.next = top;
            top = node;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack UnderFlow");
            return;
        }
        top = top.next;
    }

    public void display(){
        Node current = top;

        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        stack.pop();
        stack.display();
    }
}
