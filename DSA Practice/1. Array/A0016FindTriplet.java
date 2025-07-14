import java.util.Arrays;

public class A0016FindTriplet {

    public static boolean isTriplet(int arr[]){

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j = i+1, k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {0, -1, 2, -3, 1};
        System.out.println(isTriplet(arr));
    }
}
