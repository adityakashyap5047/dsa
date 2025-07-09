import java.util.Arrays;

public class T20IsSubarray {

    public static boolean isSubarray(int a[], int b[]){
        Arrays.sort(a);
        Arrays.sort(b);

        int j = 0;
        for (int i = 0; i < a.length && j < b.length; i++) {
            if (a[i] == b[j]) {
                j++;
            }
        }

        return j == b.length;
    }

    public static boolean isSubArray(int a[], int b[]){
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else { // a[i] > b[j] means b[j] not found in `a`
                return false;
            }
        }

        return j == b.length;
    }
    
    public static void main(String[] args) {
        int a[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int b[] = {11, 3, 7, 1, 7};

        System.out.println(isSubarray(a, b));
        System.out.println(isSubArray(a, b));
    }
}
