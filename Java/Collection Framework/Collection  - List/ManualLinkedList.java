public class ManualLinkedList {
    Node head;
    private int size;    
    
    public ManualLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++; 
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data); 
        if (head == null) {
            this.addFirst(data);
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }
    public void add(int idx , String data) {
        if(idx > size) {
            System.out.println("acessing invalid index");
            return;
        }
        Node newNode = new Node(data); 
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if(head == null) {
            if(idx == 0) {
                head=newNode;
                size++;
                return;
            }
            System.out.println("list is empty so can not add element at index = " + idx);
            return;
        }
        Node currNode = head;
        for(int i=1 ; i<=idx-1 ; i++) {
            currNode = currNode.next; // currNode points to node before the desired index
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }

    public void print() {
        if(head == null) {
            System.out.println("[LIST IS EMPTY]");
            return; // empty list
        }
            Node temp = head;
            System.out.print("[ ");
            while(temp!= null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null ]");
    }

    public void printSize() { System.out.println( "size = " + this.getSize()); }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty can not delete");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("list is empty can not delete");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while(secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        }

    public void delete (int idx) {
        if(head == null) {
            System.out.println("list is empty cant delete");
            return;
        }
        else if (idx >= size || idx < 0) {
            System.out.println("invalid index for deletion");
            return;
        }
        if(idx == 0) {
            this.deleteFirst(); // deleting by calling the deleteFirst() method
            return;
        }
        Node temp = head;
        for(int i=1 ; i<=idx-1 ; i++) {
            temp = temp.next; // to reach the node before the targer (deletion) node
        }
        temp.next = temp.next.next;
        size--;
    }

    public static void main(String[] args) {
        ManualLinkedList list = new ManualLinkedList();

        list.addFirst("this");
        list.addLast("is");
        list.addLast("list");

        list.add(2, "a");
        list.print();

        System.out.println("list size = " + list.getSize());
        
        list.deleteFirst();
        list.print();
        list.printSize(); // this method can also be used
        
        list.add(0,"this");
        list.print();
        list.printSize(); // this method can also be used
    }
}

/*
    important note:-
    remember setting a obj as null dosent remove actual refrence if others are pointing at that refrenc
    so do obj.next = null to set that refrence as null 
    same goes for other swapping and all 
    just pay attention before doing it
*/