import java.util.Arrays;

public class A0019CountTriplet {
    
    public static long countTriplet(int arr[], int target){

        Arrays.sort(arr);
        int triplet = 0;

        for (int i = 0; i < arr.length; i++) {
            int j = i+1, k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum >= target) {
                    k--;
                } else {
                    triplet += (k - j);
                    j++;
                } 
            }
        }

        return triplet;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 0, 1, 3};
        System.out.println(countTriplet(arr, 2));
    }
}
