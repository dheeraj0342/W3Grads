package Assignments.Assignment1;

import java.util.Arrays;

public class LCM_GCD {
    public static void main(String[] args) {
        Long [] ans=lcmAndGcd(5l,10l);
        System.out.println(Arrays.toString(ans));

    }
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] ans = new Long[2];
        long a = A;
        long b = B;
        while(B !=0){
            long temp = A;
            A = B;
            B = temp % A;
        }
        long LCM = a * b / A;
        ans[0]= LCM;
        ans[1] = A;
        return ans;
    }

}
