package Assignments.Assignment1;

public class CoPrime {
    public static void main(String[] args) {
        int[] nums ={2,7,28};
        int cnt=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(gcd(nums[i] , nums[i+1])!=1)
                cnt++;
        }
        System.out.println(cnt);

    }
    static int gcd(int a , int b){
        while(b !=0){
            int temp = a;
            a = b;
            b = temp% b;

        }
        return a;
    }

}
