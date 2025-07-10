class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        top += 1;
        arr[top] = x;
    }

    public int pop() {
        // Your Code
        if (top == -1) {
            return -1;
        }
        int peek = arr[top];
        top -= 1;
        return peek;
    }

    public void printStack(){
        if (top == -1) {
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class W23StackUsingArray {
    
    public static void main(String[] args) {
        MyStack s = new MyStack();

        s.push(5);
        s.push(10);
        s.printStack();
        s.pop();
        s.printStack();
    }
    
}
