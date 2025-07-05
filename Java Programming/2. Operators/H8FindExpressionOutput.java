public class H8FindExpressionOutput {
    
    public static void main(String[] args){
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        // 1 * (9 + 34) + 9 * (2 + (4 * 6)) + ((3 + (12 * (2 + 2))) / (2 + (4 * 12)))
        // 1 * 43 + 9 * (2 + 24) + ((3 + (12 * 4)) / (2 + 48))
        // 43 + 9 * 26 + ((3 + 48) / 50)
        // 43 + 234 + (51 / 50)
        // 43 + 234 + 1
        // 278
        System.out.println(exp);
    }
}
