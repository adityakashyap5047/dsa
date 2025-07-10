public class A0002SortingBinaryArray {
    
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void binSort(int arr[]){

        int leftPointer = 0, rightPointer = arr.length - 1;
        while (leftPointer < rightPointer) {
            if (arr[leftPointer] == 0) {
                leftPointer++;
            } else if (arr[leftPointer] == 1 && arr[rightPointer] == 0) {
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
                leftPointer++;
                rightPointer--;
            } else {
                rightPointer--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0};
        printArr(arr);
        binSort(arr);
        printArr(arr);
    }
}
