class Node {
    int data;
    Node next;

    // Node constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListImplementation {
    Node head;

    // Method to add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to remove a node by value
    public void remove(int data) {
        if (head == null) {
            return;
        }

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Adding nodes to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        // Displaying the linked list
        System.out.println("Linked List:");
        linkedList.display();

        // Removing a node from the linked list
        linkedList.remove(20);
        System.out.println("After removing 20:");
        linkedList.display();
        
        // Removing a node that doesn't exist
        linkedList.remove(100);
        System.out.println("After trying to remove 100:");
        linkedList.display();
    }
}
