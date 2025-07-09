public class S19FindPair {
    
    public static int pair(int arr[]){
        
        int n = arr.length;
        int si = 0;
        int ei = n - 1;

        while (si <= ei) {
            int mid = si + (ei - si)/2;

            int leftValue = mid == 0 ? Integer.MIN_VALUE : arr[mid-1];
            int rightValue = mid == (n - 1) ? Integer.MIN_VALUE : arr[mid + 1];

            if (arr[mid] > leftValue && arr[mid] > rightValue) {
                return mid;
            } else if(arr[mid] > leftValue) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 5, 9, 6, 0};

        System.out.println(pair(arr));
    }
}
