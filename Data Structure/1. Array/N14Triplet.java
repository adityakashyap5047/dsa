import java.util.Arrays;

public class N14Triplet {

    public static void triplet(int num[], int target){

        Arrays.sort(num);
        
        for (int i = 0; i < num.length - 2; i++) {
            if (i > 0 && num[i] == num[i-1]) continue;
            int l = i + 1;
            int r = num.length - 1;

            while (l < r) {
                int sum = num[i] + num[l] + num[r];
                if (sum == target) {
                    System.out.println(num[i] + " " + num[l] + " " + num[r]);
                    int leftVal = num[l];
                    int rightVal = num[r];
                    while (l < r && num[l] == leftVal) l++;
                    while (l < r && num[r] == rightVal) r--;
                } else if (sum > target) {
                    r--;
                } else{
                    l++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int num[] = {-1, 0, 1, 2, -1, -4};
        triplet(num, 0);
    }
}
