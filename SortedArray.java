package Recursion;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {66,1,33,2};

        sortAsc(nums);
        System.out.println("Ascending order");
        System.out.println(Arrays.toString(nums));

        System.out.println("Descending Order");
        sortDesc(nums);
        System.out.println(Arrays.toString(nums));

    }
    static int[] sortAsc(int []nums ){


        for(int i = 0;i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    static int[] sortDesc(int []nums ){

        for(int i = 0;i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i] < nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
