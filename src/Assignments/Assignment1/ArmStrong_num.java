package Assignments.Assignment1;

public class ArmStrong_num {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));

    }
    static String armstrongNumber(int n) {
        int len = (int)Math.log10(n)+1;
        int num =n;
        int ans=0;
        while(n >0){
            int ld = n % 10;
            ans = ans + (int)Math.pow(ld,len);
            n/=10;
        }
        if(num == ans)
            return "true";
        else{
            return "false";
        }
    }
}
