public class H3PassAndFailUsingTernary {
    
    public static void main(String[] args) {
        int marks = 50;

        String status = (marks >= 33) ? "Pass" : "Fail";

        System.out.println("The student got marks: " + marks + " Therefore, he is " + status);
    }
}
