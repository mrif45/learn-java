import java.util.ArrayList; 
  
class CircularQueue{   
    private int size, front, rear; 
    private ArrayList<Integer> queue = new ArrayList<Integer>(); 
    
    CircularQueue(int size) { 
        this.size = size; 
        this.front = this.rear = -1; 
    } 
    
    public void enQueue(int data) { 
        if((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) { 
            System.out.print("Queue is Full"); 

        } else if (front == -1) { 
            front = 0; 
            rear = 0; 
            queue.add(rear, data); 

        } else if (rear == size - 1 && front != 0) { 
            rear = 0; 
            queue.set(rear, data); 

        } else { 
            rear = (rear + 1); 
        
            if(front <= rear) { 
                queue.add(rear, data); 
            } else { 
                queue.set(rear, data); 
            } 
        } 
    } 
    
    // Function to dequeue an element 
    // form th queue. 
    public int deQueue() { 
        int temp; 
    
        // Condition for empty queue. 
        if(front == -1) { 
            System.out.print("Queue is Empty"); 
            
            // Return -1 in case of empty queue 
            return -1;  
        } 
    
        temp = queue.get(front); 
            
        if(front == rear) { 
            front = -1; 
            rear = -1; 

        } else if (front == size - 1) { 
            front = 0; 
            
        } else { 
            front = front + 1; 
        } 
        return temp; 
    } 
    
    public void displayQueue() { 
        if(front == -1) { 
            System.out.print("Queue is Empty"); 
            return; 
        } 
    
        System.out.print("Elements in the circular queue are: "); 
    
        if(rear >= front) { 
            for(int i = front; i <= rear; i++) { 
                System.out.print(queue.get(i)); 
                System.out.print(" "); 
            } 
            System.out.println(); 
        } else { 
            for(int i = front; i < size; i++) { 
                System.out.print(queue.get(i)); 
                System.out.print(" "); 
            } 
    
            for(int i = 0; i <= rear; i++) { 
                System.out.print(queue.get(i)); 
                System.out.print(" "); 
            } 
            System.out.println(); 
        } 
    } 
    
    public static void main(String[] args) { 
        CircularQueue q = new CircularQueue(5); 
        
        q.enQueue(14); 
        q.enQueue(22); 
        q.enQueue(13); 
        q.enQueue(-6); 
        
        q.displayQueue(); 
    
        int x = q.deQueue(); 
    
        if(x != -1) { 
            System.out.print("Deleted value = "); 
            System.out.println(x); 
        } 
    
        x = q.deQueue(); 
    
        if(x != -1) { 
            System.out.print("Deleted value = "); 
            System.out.println(x); 
        } 
    
        q.displayQueue(); 
        
        q.enQueue(9); 
        q.enQueue(20); 
        q.enQueue(5); 
        
        q.displayQueue(); 
        
        q.enQueue(20); 
    } 
} 

// Circular Queue implementation in Java

// public class CircularQueue {
//     int SIZE = 5; // Size of Circular Queue
//     int front, rear;
//     int items[] = new int[SIZE];

//     CircularQueue() {
//         front = -1;
//         rear = -1;
//     }

//     // Check if the queue is full
//     boolean isFull() {
//         if (front == 0 && rear == SIZE - 1) {
//             return true;
//         }
//         if (front == rear + 1) {
//             return true;
//         }
//         return false;
//     }

//     // Check if the queue is empty
//     boolean isEmpty() {
//         if (front == -1)
//             return true;
//         else
//             return false;
//     }

//     // Adding an element
//     void enQueue(int element) {
//         if (isFull()) {
//             System.out.println("Queue is full");
//         } else {
//             if (front == -1)
//                 front = 0;
//             rear = (rear + 1) % SIZE;
//             items[rear] = element;
//             System.out.println("Inserted " + element);
//         }
//     }

//     // Removing an element
//     int deQueue() {
//         int element;
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return (-1);
//         } else {
//             element = items[front];
//             if (front == rear) {
//                 front = -1;
//                 rear = -1;
//             } /* Q has only one element, so we reset the queue after deleting it. */
//             else {
//                 front = (front + 1) % SIZE;
//             }
//             return (element);
//         }
//     }

//     void display() {
//         /* Function to display status of Circular Queue */
//         int i;
//         if (isEmpty()) {
//             System.out.println("Empty Queue");
//         } else {
//             System.out.println("Front -> " + front);
//             System.out.println("Items -> ");
//             for (i = front; i != rear; i = (i + 1) % SIZE)
//                 System.out.print(items[i] + " ");
//             System.out.println(items[i]);
//             System.out.println("Rear -> " + rear);
//         }
//     }

//     public static void main(String[] args) {

//         CircularQueue q = new CircularQueue();

//         // Fails because front = -1
//         q.deQueue();

//         q.enQueue(1);
//         q.enQueue(2);
//         q.enQueue(3);
//         q.enQueue(4);
//         q.enQueue(5);

//         // Fails to enqueue because front == 0 && rear == SIZE - 1
//         q.enQueue(6);

//         q.display();

//         int elem = q.deQueue();

//         if (elem != -1) {
//             System.out.println("Deleted Element is " + elem);
//         }
//         q.display();

//         q.enQueue(7);

//         q.display();

//         // Fails to enqueue because front == rear + 1
//         q.enQueue(8);
//     }

// }