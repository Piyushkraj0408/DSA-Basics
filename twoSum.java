import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
    int[] nums={1,5,8,3,9,6};
    int target=6;
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (seen.containsKey(need)) {
                System.out.printf("%d %d%n", seen.get(need), i);
                return;
            }

            seen.put(nums[i], i);
        }

        // Problem guarantees exactly one solution
        return;
    }
}