public class R18FindPivotInRotatedArray {

    public static int pivot(int arr[]){
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si)/2;

            if (mid > 0 && arr[mid-1] > arr[mid]) {
                return arr[mid];
            } else if (arr[si] <= arr[mid] && arr[mid] > arr[ei]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(pivot(arr));
        int arr2[] = {3, 4, 5, 1, 2};
        System.out.println(pivot(arr2));
    }
}
