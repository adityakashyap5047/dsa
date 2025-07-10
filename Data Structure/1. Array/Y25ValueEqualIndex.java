import java.util.ArrayList;
import java.util.List;

public class Y25ValueEqualIndex {
    
    public static List<Integer> valueEqualToIndex(List<Integer> nums){
        List<Integer> valueEqualIndex = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == i+1) {
                valueEqualIndex.add(i+1);
            }
        }

        return valueEqualIndex;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(15);
        nums.add(2);
        nums.add(34);
        nums.add(4);

        List<Integer> valueEqualIndex = valueEqualToIndex(nums);
        for(int i = 0; i < valueEqualIndex.size(); i++){
            System.out.print(valueEqualIndex.get(i) + " ");
        }
        System.out.println();
    }
}
