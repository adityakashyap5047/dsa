public class C3LogicalOperator {

    public static void main(String[] args) {
        
        int A = 10;
        int B = 5;

        System.out.println("\n\nLogical And in java");
        System.out.println((A > 5) && (B < 10)); 
        System.out.println((A > 5) && (B > 10));
        System.out.println((A < 5) && (B < 10));
        System.out.println((A < 5) && (B > 10));

        System.out.println("\n\nLogical Or in java");
        System.out.println((A > 5) || (B < 10)); 
        System.out.println((A > 5) || (B > 10));
        System.out.println((A < 5) || (B < 10));
        System.out.println((A < 5) || (B > 10));

        System.out.println("\n\nLogical Not in java");
        System.out.println(!(A < 5));
        System.out.println(!(B < 10));
    }
}