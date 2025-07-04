public class L1TypePromotion {
    
    public static void main(String[] args) {
        
        char a = 'a';
        char b = 'b';

        System.out.println("Number A: " + (int)a);
        System.out.println("Number B: " + (int)b);

        System.out.println("B - A = " + (b - a));

        // char c = b - a; // Type mismatch: cannot convert from int to char
        // System.out.println("C: " + c);

        short s1 = 5;
        byte b1 = 34;
        char ch = 'c';
        
        // byte bt = s1 + b1 + ch; // Type mismatch: cannot convert from int to byte
        // System.out.println(bt);
        
        byte byt = (byte)(s1 + b1 + ch);
        System.out.println(byt);

        int a2 = 10;
        float b2 = 20.3f;
        long c2 = 43;
        double d2 = 34.3;

        double ans = a2 + b2 - c2 + d2;
        System.out.println(ans);


        byte bt = 5;
        
        // bt = bt * 2;

        bt = (byte)(bt * 2);
    }
}
