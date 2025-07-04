import java.util.Scanner;

public class K1TypeCasting {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        int intMarks = (int)marks;

        System.out.println("Your mark is: " + intMarks);
        sc.close();
    }
}
