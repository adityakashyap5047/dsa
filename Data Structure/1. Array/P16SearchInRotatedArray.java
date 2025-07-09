public class P16SearchInRotatedArray{

    public static int searchInRotatedArray(int arr[], int target){

        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] >= arr[si]) {
                if (arr[si] <= target && target < arr[mid]) {
                    ei = (mid - 1);
                } else {
                    si = (mid + 1);
                }
            } else {
                if (arr[ei] >= target && target > arr[mid]) {
                    si = (mid + 1);
                } else {
                    ei = (mid - 1);
                }
            } 
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(searchInRotatedArray(arr, target));
    }
}