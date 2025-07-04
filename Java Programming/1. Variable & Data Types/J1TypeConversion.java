import java.util.Scanner;

public class J1TypeConversion {
    
    public static void main(String[] args) {
        
        int a = 5;
        long b = a;

        System.out.println("A is: " + a);
        System.out.println("B is " + b);

        long c = 10;
        // int d = c;   // Error: incompatible types: possible lossy conversion from long to int 

        System.out.println("C is: " + c);
        // System.out.println("D is " + d);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Marks: ");
        float marks = sc.nextInt();
        System.out.println("Marks: " + marks);

        // int number = sc.nextFloat();    //Error: incompatible types: possible lossy conversion from float to int
        // System.out.println("Number: " + number);


        char ch = 'a';
        int charNum = ch;
        System.out.println(charNum);

        sc.close();
    }
}
