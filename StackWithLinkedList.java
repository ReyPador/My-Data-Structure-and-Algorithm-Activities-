class StackWithLinkedList {
    private Node top; // Top of the stack (linked list)
    
    // Node class represents each element in the stack
    private static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize the stack
    public Stack() {
        top = null;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // Point the new node to the previous top
        top = newNode; // Make the new node the new top
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next; // Move top to the next node
        return poppedValue;
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }

    // Method to print the elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node currentNode = top;
        System.out.print("Stack elements: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Printing the stack
        stack.printStack(); // Output: Stack elements: 40 30 20 10

        // Peeking the top element
        System.out.println("Top element is: " + stack.peek()); // Output: 40

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: 40
        stack.printStack(); // Output: Stack elements: 30 20 10

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        stack.printStack(); // Output: Stack elements: 20 10
    }
}
