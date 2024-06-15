package Assignments.Assignment2;

public class Third_max {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
       long max1= Long.MIN_VALUE;
       long max2 = Long.MIN_VALUE;
       long max3 = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max1 < nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (max1 > nums[i] && max2 <nums[i]) {
                max3 = max2;
                max2 = nums[i];
            }else{
                max3 = nums[i];
            }
        }
        int ans = max3 != Long.MIN_VALUE ? (int)max3 :(int) max1;
        System.out.println(ans);

    }
}
