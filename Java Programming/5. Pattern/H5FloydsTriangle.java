public class H5FloydsTriangle {

    /*
     
        1 
        2 3 
        4 5 6 
        7 8 9 10 
        11 12 13 14 15

    */
    
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
