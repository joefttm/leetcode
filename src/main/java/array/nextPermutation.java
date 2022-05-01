package array;

import java.util.Arrays;

public class nextPermutation {

    public static void solve(int[] nums) {
        int pivot = nums.length - 2;
        while(pivot >= 0 && nums[pivot] >= nums[pivot + 1]) --pivot;
        // pivot == -1 || nums[pivot] <= nums[pivot + 1];
        if (pivot == -1) {
            Arrays.sort(nums);
            return;
        }

        int j = pivot + 1, swap = nums.length - 1;
        while(swap >= j && nums[swap] <= nums[pivot]) --swap;

        swapElement(nums, pivot, swap);

        Arrays.sort(nums, j, nums.length);
    }

    public static void swapElement(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,1};
        solve(nums);
        for(int c : nums) {
            System.out.println(c);
        }
    }
}
