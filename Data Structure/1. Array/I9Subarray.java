public class I9Subarray {
    
    public static int printSubarrays(int arr[]){
        System.out.println("****************************************************");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                if (max < sum) {
                    max = sum;
                }
            }
            System.out.println();
        } 
        System.out.println("*****************************************");
        
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        System.out.println(printSubarrays(arr));
        int num[] = {1, -2, 6, -1, 3};
        System.out.println(printSubarrays(num));
        int arr2[] = {20, -3, -4, -1};
        System.out.println(printSubarrays(arr2));
    }
}
