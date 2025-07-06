public class O5PalindromeNumber {
    
    /*
        
                 1
              2  1  2        
           3  2  1  2  3     
        4  3  2  1  2  3  4 
    
    */

    public static void main(String[] args) {
        
        int n = 4;

        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= (n*2 - 1); j++) {
                if (j > (n - i) && j < (n + i)) {
                    if (j >= n) {
                        System.out.print(num + "  ");
                        num++;
                    } else{
                        System.out.print((n - j + 1) + "  ");
                    }
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
