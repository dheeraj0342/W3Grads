package Class_Code.Day3;

public class LeetCode_41 {
    public static void main(String[] args) {
        int [] nums = {1,2,0};
        int i=0;
        while(i<nums.length){
            int check = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[check]){
                int temp = nums[i];
                nums[i] = nums[check];
                nums[check] = temp;
            }
            else
                i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1)
                System.out.println(j+1);
                break;
        }
        System.out.println(nums.length);
    }
}
