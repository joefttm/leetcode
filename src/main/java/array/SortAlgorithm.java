package array;

import java.util.Arrays;

public class SortAlgorithm {

    public static void bubbleSort(int[] nums) {
        if (nums.length == 0) return;
        int n = nums.length;

        for(int i = 0; i < n-1; ++i) {
            boolean swaped = false;
            for(int j = 0; j < n - i - 1; ++j) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaped = true;
                }
            }
            System.out.printf("after %dth sort, array is: %s%n", i + 1, Arrays.toString(nums));
            if (!swaped) break;
        }
    }
    public static void selectSort(int[] nums) {
        if (nums.length == 0) return;
        final int n = nums.length;
        for(int i = 0; i < n-1; ++i) {
            int selectedIndex = i;
            for(int j = i+1; j < n; ++j) {
                if (nums[j] < nums[selectedIndex]) {
                    selectedIndex = j;
                }
            }
            {
                int temp = nums[i];
                nums[i] = nums[selectedIndex];
                nums[selectedIndex] = temp;
            }
            System.out.printf("after %dth sort, array is: %s%n", i + 1, Arrays.toString(nums));
        }
    }
    public static void insertionSort(int[] nums) {
        if (nums.length == 0) return;
        final int n = nums.length;
        for(int i=1;i<n;++i) {
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                --j;
            }
            nums[j+1] = key;
            System.out.printf("after %dth sort, array is: %s%n", i, Arrays.toString(nums));
        }
    }
    public static void mergeSort(int[] nums, int l ,int r) {
        if (nums.length <= 1 || l >= r) return;
        int mid = l+ (r-l)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, mid, r);
    }

    public static void merge(int[] nums, int l, int mid, int r) {
        System.out.printf("before merge %d %d %d, array is: %s%n",l, mid, r, Arrays.toString(nums));
        int[] leftArr = Arrays.copyOfRange(nums, l, mid);
        int[] rightArr = Arrays.copyOfRange(nums, mid+1, r);
        final int nl = leftArr.length;
        final int nr = rightArr.length;
        int i=0, j=0, k=l;
        while (i<nl && j<nr) {
            if (leftArr[i] < rightArr[j]) {
                nums[k] = leftArr[i];
                ++i;
            } else{
                nums[k] = rightArr[j];
                ++j;
            }
            ++k;
        }
        while(i < nl) {
            nums[k] = leftArr[i];
            ++i;
            ++k;
        }
        while(j < nr) {
            nums[k] = rightArr[j];
            ++j;
            ++k;
        }
        System.out.printf("after merge %d %d %d, array is: %s%n",l, mid, r, Arrays.toString(nums));
    }
}
