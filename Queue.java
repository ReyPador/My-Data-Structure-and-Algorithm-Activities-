public class Queue {
    private int [] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;
    
    public Queue (int size) {
        maxSize = size;
        queueArray = new int [maxSize];
        front = 0;
        rear = 0;
        currentSize = 0;
        
    }
    
    public void enqueue (int value) {
        if (isFull ()) {
            System.out.println ("Queue is full. Cannot enqueue " + value);
        }
        else {
          rear = (rear + 1) % maxSize;
          queueArray[rear] = value;
          currentSize++;
        }
    }
    
    public int dequeue () {
          if (isEmpty ()) {
              System.out.println ("Queue is empty. Cannot dequeue.");
              return -1;
          }
          else {
              int value = queueArray [front];
              currentSize --;
              return value;
          }
    }
    
    public int peek () {
          if (isEmpty ()) {
              System.out.println ("Queue is empty.");
              return -1;
          }
          else {
              return queueArray [front];
          }
    }
    
    public boolean isEmpty () {
        return (currentSize == 0);
    }
    
    public boolean isFull () {
        return (currentSize == maxSize);
    }
    
    public static void main (String [] args) {
        Queue queue = new Queue (5);
        
        queue.enqueue (10);
        queue.enqueue (20);
        queue.enqueue (30);
        queue.enqueue (40);
        queue.enqueue (50);
        queue.enqueue (60);
        
        System.out.println ("Front element is: " + queue.peek ());
        System.out.println ("Dequeued element is: " + queue.dequeue ());
        System.out.println ("Front element after dequeue: " + queue.peek());
    }
    }
