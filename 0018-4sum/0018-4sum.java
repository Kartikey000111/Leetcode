import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {

                int low = j + 1;
                int high = nums.length - 1;

                while (low < high) {
                    long sum = (long) nums[i] + nums[j] + nums[low] + nums[high];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        low++;
                        high--;
                    } else if (sum < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
}