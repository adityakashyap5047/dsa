public class G7ReverseAnArray {

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 8, 0, 5};
        printArr(arr);
        reverse(arr);
        printArr(arr);
    }
}
