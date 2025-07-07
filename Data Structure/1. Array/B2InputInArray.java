import java.util.Scanner;

public class B2InputInArray {
    
    public static void main(String[] args) {
        
        int marks[] = new int[40];

        Scanner sc = new Scanner(System.in);

        int num;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter elements of Array: ");
            num = sc.nextInt();

            marks[i] = num;
        }

        System.out.print("The array is: ");
        for (int i = 1; i <= 3; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        System.out.println("The length of Array is: " + marks.length);
        sc.close();
    }
}
