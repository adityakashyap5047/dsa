class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        arr[rear] = x;
        rear += 1;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        // Your code here
        int peek = arr[front];
        front += 1;
        return peek;
    }

    void printQueue(){
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class X24QueueUsingArray {
    
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(5);
        q.push(4);
        q.printQueue();
        q.pop();
        q.printQueue();
    }
}
