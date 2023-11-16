package sulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    @Test
    public void testMergedArrayReturnTheMedian(){
        MergeSortedArray sortedArray = new MergeSortedArray();
        int[] nums1 ={1,3};
        int[] nums2 = {2};
        double actual = sortedArray.findMedianSortedArray(nums1,nums2);
        assertEquals(2.00000,actual);
    }

}