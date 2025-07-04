public class P1FindingExpressionOutput {
    
    public static void main(String[] args) {
        
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i * c) - (d * s); // (3.14 * 4) + (1000 * 97) - (99.9954 * 512)
        System.out.println("The result will be: " + result); // 45814.91
    }
}
