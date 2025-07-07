public class D4LinearSearch {

    public static int linearSearch(int numbers[], int target){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int numbers[] = {3, 4, 1, 9, 5, 8, 6};

        System.out.println(linearSearch(numbers, 5));
        System.out.println(linearSearch(numbers, 6));
        System.out.println(linearSearch(numbers, 0));
    }
}
