import java.util.Scanner;

public class I4Break {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your question or `q` for quit: ");
            String ques = sc.nextLine();

            if (ques.charAt(0) == 'q') {
                break;
            }
        }
        sc.close();
    }
}
