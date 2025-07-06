public class C6SwapNumber {

    public static void swap(int a, int b){
        int temp = b;
        b = a;
        a = temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("In Main Function, A: " + a);
        System.out.println("In Main Function, B: " + b);
    }
}
