package Assignments.Assignment2;

public class IsRotated {
    public static void main(String[] args) {
        int[] nums ={3,4,5,1,2};
        int cnt=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] >nums[i])
                cnt++;

        }
        if(nums[0] < nums[nums.length-1])
            cnt++;
        if(cnt<=1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
