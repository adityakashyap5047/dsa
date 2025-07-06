public class H5FloydsTriangle {
    
    public static void main(String[] args) {
        int n = 5;

        int fi = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(fi + " ");
                fi++;
            }
            System.out.println();
        }
    }
}
