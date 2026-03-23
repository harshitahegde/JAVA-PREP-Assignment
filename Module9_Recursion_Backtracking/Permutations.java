// LeetCode 46 – Permutations
import java.util.*;

class Permutations {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        make(result, new ArrayList<>(), nums, used);
        return result;
    }

    void make(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) continue;

            current.add(nums[i]);
            used[i] = true;

            make(result, current, nums, used);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}