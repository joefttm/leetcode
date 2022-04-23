package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] solve(int[] nums, int target) {
        Map<Integer, Integer> nums2Index = new HashMap<>(nums.length);
        for(int i=0; i<nums.length; ++i) {
            int need = target - nums[i];
            if (nums2Index.containsKey(need)) {
                return new int[] {nums2Index.get(need), i};
            }
            nums2Index.put(nums[i], i);
        }
        return new int[]{};
    }
}
