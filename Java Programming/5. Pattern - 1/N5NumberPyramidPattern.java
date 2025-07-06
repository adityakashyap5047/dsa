public class N5NumberPyramidPattern {
    
    public static void main(String[] args) {
        
        int n = 4;

        int num = 1;
        for (int i = 1; i <= n; i++) {
            boolean bool = true;
            for (int j = 1; j <= (n*2 - 1); j++) {
                if (j > (n - i) && j < (n + i)) {
                    if (bool) {
                        System.out.print(num);
                    } else{
                        System.out.print(" ");
                    }
                    bool = !bool;
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            num++;
        }
    }
}
