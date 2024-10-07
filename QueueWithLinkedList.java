// Node class to represent each element in the queue
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class to implement queue operations using linked list
class QueueWithLinkedList{
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty, new node becomes both front and rear
        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(data + " enqueued to queue");
            return;
        }

        // Add new node at the rear and update rear
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue operation
    public void dequeue() {
        // If queue is empty, return
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }

        // Remove front node and update front
        int dequeuedValue = this.front.data;
        this.front = this.front.next;

        // If front becomes null, rear should also be null
        if (this.front == null) {
            this.rear = null;
        }
        System.out.println(dequeuedValue + " dequeued from queue");
    }

    // Peek operation
    public int peek() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return this.front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return this.front == null;
    }

    public void printQueue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }

        // Start from the front and traverse through the queue
        Node current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();  // Move to next line after printing all elements
    }
    public void reverseQueue() {
        // Base case: if queue is empty
        if (isEmpty()) {
            return;
        }

        // Step 1: Dequeue the front element
        int frontElement = peek();
        dequeue();

        // Step 2: Recursively reverse the remaining queue
        reverseQueue();

        // Step 3: Enqueue the dequeued element at the rear
        enqueue(frontElement);
    }

}


// Main class to test queue operations
public class Main{

    public static void main(String[] args) {
        Queue queue = new Queue();
        
        queue.enqueue(10); // Expected: 10 enqueued to queue
        queue.enqueue(20); // Expected: 20 enqueued to queue
        queue.enqueue(30); // Expected: 30 enqueued to queue
        queue.printQueue();
        
        System.out.println("Front element is " + queue.peek()); 
        
        queue.reverseQueue();
        
           queue.printQueue();
        
        System.out.println("Front element is " + queue.peek()); 
        
        
    }
}
