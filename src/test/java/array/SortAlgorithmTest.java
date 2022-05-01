package array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmTest {


    @Test
    void bubbleSort() {
    }

    @Test
    void selectSort() {

    }

    @Test
    void insertionSort() {
        int[] nums = {2,3,1,5,4};
        SortAlgorithm.insertionSort(nums);
    }

    @Test
    void mergeSort() {
        int[] nums = {2,3,1,5,4};
        SortAlgorithm.mergeSort(nums, 0, nums.length - 1);
        System.out.printf("after sort, array is: %s%n",  Arrays.toString(nums));
    }
}