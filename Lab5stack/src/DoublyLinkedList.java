class Node1 {
    int data;
    Node1 prev;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    private Node1 head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
        } else {
            Node1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void display() {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(5);
        list.insert(10);
        list.insert(15);

        System.out.println("Doubly Linked List:");
        list.display();
    }
}
