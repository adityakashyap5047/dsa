public class M5DiamondPattern {

    /*

           *   
          ***
         *****
        *******
        *******
         *****
          ***
           *
    
   */
    
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n*2 - 1); j++) {
                if (j > (n - i) && j < (n + i)) {
                    System.out.print('*');
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n*2 - 1); j++) {
                if ((j >= i) && (j <= (n*2 - i))) {
                    System.out.print('*');
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
