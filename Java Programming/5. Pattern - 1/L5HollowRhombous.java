public class L5HollowRhombous {

    /*
    
                * * * * * 
               *       * 
              *       * 
             *       * 
            * * * * * 

    */
    
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n*2 - i); j++) {
                if (j >= (n - i + 1)) {
                    if (i == 1 || i == n || j == ((n - i + 1)) || j == (n*2 - i)) {
                        System.out.print('*' + " ");
                    } else {
                        System.err.print("  ");
                    }
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
