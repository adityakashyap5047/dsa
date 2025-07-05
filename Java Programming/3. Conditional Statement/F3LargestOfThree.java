public class F3LargestOfThree {
    
    public static void main(String[] args) {
        
        int A = 5, B = 9, C = 10;
        int max;

        if (A > B && A > C) {
            max = A;
        } else if(B > A && B > C){
            max = B;
        } else {
            max = C;
        }

        System.out.println("The maximum of " + A + ", " + B + " and " + C + " is: " + max);
    }
}
