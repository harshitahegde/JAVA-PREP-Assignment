package Module9_Recursion_Backtracking;

// LeetCode 78 – Subsets
import java.util.*;

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        make(result, new ArrayList<>(), nums, 0);
        return result;
    }

    void make(List<List<Integer>> result, List<Integer> current, int[] nums, int index) {

        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            make(result, current, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
