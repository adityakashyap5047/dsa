public class Q17IsRotatedArray {
    
    public static boolean isRotated(int arr[]){
        
        int n = arr.length;
        int pivotCount = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i+1]) {
                pivotCount++;
            }
        }
        if (pivotCount == 0) return true;
        else if (pivotCount == 1 && arr[n-1] < arr[0]) return true;
        else return false;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(isRotated(arr));
        int arr2[] = {3, 4, 5, 1, 2};
        System.out.println(isRotated(arr2));
        int arr3[] = {2, 1, 3, 4};
        System.out.println(isRotated(arr3));
        int arr4[] = {1, 2, 3};
        System.out.println(isRotated(arr4));
    }
}
