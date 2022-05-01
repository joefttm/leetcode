package array;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l <= r) {
            int mid = (r + l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[l] <= nums[mid])
            {
                if (target >= nums[l] && target < nums[mid])
                    r = mid-1;
                else
                    l = mid+1;
            }
            else
            {
                if (target > nums[mid] && target <= nums[r])
                    l = mid +1;
                else
                    r = mid -1;
            }
        }
        return -1;
    }

    public int lower_bound(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                r = mid;
            } else if (nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return r>=0 && nums[r] == target ? r : -1;
    }

    public int upper_bound(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<r) {
            int mid = l + (r - l + 1) / 2;
            if (nums[mid] == target) {
                l = mid;
            } else if (nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return nums[l] == target ? l : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 1;
        SearchInRotatedSortedArray solveClass = new SearchInRotatedSortedArray();
//        int ans = solveClass.search(nums, target);
        int ans = solveClass.lower_bound(nums, target);
        System.out.println(ans);
    }
}
