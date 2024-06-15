package Assignments.Assignment1;

public class Min_jumps {
    public static void main(String[] args) {
        int[] nums ={2,3,1,1,4};
        int l=0;
        int r=0;
        int jumps=0;
        int farthest =0;
        while( r < nums.length-1){
            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest,i+nums[i]);
            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        System.out.println(jumps);
    }
}
