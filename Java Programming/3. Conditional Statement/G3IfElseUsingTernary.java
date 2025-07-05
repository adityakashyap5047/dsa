public class G3IfElseUsingTernary {
    
    public static void main(String[] args) {
        
        int num = 8;

        String type = ((num % 2) == 0) ? "Even" : "Odd";

        System.out.println(num + " is an " + type + " number.");
    }
}
