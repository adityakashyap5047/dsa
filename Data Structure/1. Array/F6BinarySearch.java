public class F6BinarySearch {

    public static int binarySearch(int arr[], int target){
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 8, 9, 11, 13, 15};
        System.out.println(binarySearch(arr, 3));   // 1
        System.out.println(binarySearch(arr, 6));   // 3
        System.out.println(binarySearch(arr, 8));   // 4
        System.out.println(binarySearch(arr, 11));  // 6
        System.out.println(binarySearch(arr, 2));   // 0
        System.out.println(binarySearch(arr, 15));  // 8
        System.out.println(binarySearch(arr, 10));  // -1
    }
}
