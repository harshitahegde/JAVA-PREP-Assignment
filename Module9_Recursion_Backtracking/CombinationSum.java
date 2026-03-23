

// LeetCode 39 – Combination Sum
import java.util.*;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        make(result, new ArrayList<>(), nums, target, 0);

        return result;
    }

    void make(List<List<Integer>> result, List<Integer> current, int[] nums, int target, int index) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) return;

        for (int i = index; i < nums.length; i++) {

            current.add(nums[i]);
            make(result, current, nums, target - nums[i], i);
            current.remove(current.size() - 1);
        }
    }
}
