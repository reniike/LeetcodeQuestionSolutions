package sulty;

public class MergeSortedArray {
    public double findMedianSortedArray(int[] nums1, int[] nums2){
        int num1Length= nums1.length;
        int num2Length = nums2.length;
        int sumOfBothLength = num1Length + num2Length;
        int[] SortedArray = new int[sumOfBothLength];
        int index=0; int count =0;
        for(int thisIndex=0;thisIndex<sumOfBothLength;thisIndex++){
            if(index<num1Length&&count<num2Length){
                if(nums1 == null || nums1[index]>nums2[count]){
                    SortedArray[thisIndex]=nums2[count];
                    count++;
                }
                else{
                    SortedArray[thisIndex]=nums1[index];
                    index++;
                }
            }
        }
        double medianValue=0;
        if(sumOfBothLength%2 == 0){
            medianValue= (SortedArray[sumOfBothLength/2]+ SortedArray[(sumOfBothLength/2)-1])/2;
        }
        else{
            medianValue=Math.floor(SortedArray[sumOfBothLength/2]);
        }
        return medianValue;

    }
}
