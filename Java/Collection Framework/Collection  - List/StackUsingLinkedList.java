public class StackUsingLinkedList{
    class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            next = null;
        }
    }
    class myStack {
        final private int capacity;
        private int top;
        public Node head;

        public myStack () {
            top = 0;
            capacity = 10; // stack capacity is 10
        }

        public boolean isFull() {
            return top >= capacity;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public int getCapacity () {
            return this.capacity;
        }

        public void push(int data) {
            if(isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            Node newNode = new Node(data);
            top++;
            if(isEmpty()) {
                head = newNode;
                System.out.format("pushed: %d into the stack \n",data);
                return;
            }
            newNode.next = head; // linking node
            head = newNode; // pointing head to newNode so head stays at the top
            System.out.format("pushed: %d into the stack \n",data);
        }
        public void pop () {
           if (isEmpty()) {
                System.out.println("Stack underflow");
                return;
            }
            int popVal = head.data;
            head = head.next;
            top--;
            System.out.format("Popped: %d from the stack \n",popVal);
        }

        public int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
            }
            return head.data;
        }
        public int peek(String message) {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }
            System.out.println(message + head.data);
            return head.data;
        }

        public void printStack() {
            Node temp = head;
            for(int i=1 ; i<=top ; i++) {  //  or we can use while (temp != null)
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("END \n");
        }
        public void printStack(String message) {
            System.out.println(message);
            this.printStack();
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedList obj = new StackUsingLinkedList();
        
        StackUsingLinkedList.myStack useStack = obj.new myStack(); 
        
        useStack.push(54);
        useStack.push(62);
        useStack.push(87);
        System.out.println("capacity = " + useStack.getCapacity());
        useStack.pop();
        useStack.pop();
        useStack.push(34);
        useStack.push(45);
        useStack.push(23);
        useStack.peek("peeking in stack : "); // can also use like this System.out.println(useStack.peek());
        useStack.printStack("printing stack :");
        
    }
}

/*
    // step by step visualisation of push() 

    1. A(NODE 1)*head

    2.a B(NODE 2) -> A(NODE 1)*head
    2.b B(NODE 2)*head -> A 

    3.a C(NODE 3) -> B(NODE 2)*head -> A(NODE 1)
    3.b C(NODE 3)*head -> B(NODE 2) -> A(NODE 1)

    and so goes on !
*/