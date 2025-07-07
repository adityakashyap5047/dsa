public class C3ArrayAsArgument {
    
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }

    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {3, 5, 7};
        printArr(marks);
        update(marks);
        printArr(marks);
    }
}
