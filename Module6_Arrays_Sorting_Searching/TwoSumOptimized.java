import java.util.*;

public class TwoSumOptimized {

    public static void main(String[] args) {

        int nums[] = {4, 6, 8, 2, 5};
        int target = 10;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if(map.containsKey(need)) {
                System.out.println("Pair found at index " + map.get(need) + " and " + i);
                return;
            }

            map.put(nums[i], i);
        }

        System.out.println("No pair found");
    }
}