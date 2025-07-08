import java.util.HashSet;

public class O15IsDuplicateExistInArray{

    public static boolean isDuplicate(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if (!set.add(arr[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(isDuplicate(arr));
    }
}