public class D4AssignmentOperator {
    
    public static void main(String[] args) {
        
        int A = 10;
        int B = 5;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("A = A + B === A += B: " + (A += B)); 
        System.out.println("A = A - B === A -= B: " + (A -= B)); 
        System.out.println("A = A * B === A *= B: " + (A *= B)); 
        System.out.println("A = A / B === A /= B: " + (A /= B)); 
        System.out.println("A = A % B === A %= B: " + (A %= B)); 
    }
}
