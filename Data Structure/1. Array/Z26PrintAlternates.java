public class Z26PrintAlternates {
    
    public static void printAlternates(int arr[]){
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printAlternates(arr);
    }
}
