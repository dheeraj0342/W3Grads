package Assignments.Assignment2;

import java.util.Arrays;

public class Move_zeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int l=0;
        int r=0;
        while(r < nums.length){
            if(nums[r] !=0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
