import java.util.Scanner;

public class F1InputInJava {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("What is Your First Name: ");
        String fName = sc.next();

        System.out.print("Hello, " + fName + " Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your course and branch: ");
        String courseNBranch = sc.nextLine();

        System.out.print("Enter your cgpa: ");
        float cgpa = sc.nextFloat();

        System.out.println("Hello " + fName + ", you are " + age + " years old, studying in " + courseNBranch + " with a CGPA of " + cgpa);
        
        sc.close();
    }
}
