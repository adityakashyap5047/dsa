public class V22CyclicRotateByOne {
    
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void rotate(int arr[]){
        int key = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = key;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        printArr(arr);
        rotate(arr);
        printArr(arr);
    }
}
