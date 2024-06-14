package Assignments.Assignment1;

public class Palindrome {
    public static void main(String[] args) {
        int x =1221;
        if( x < 0){
            System.out.println(false);
            return;
        }

        final int num = x;
        int reverse=0;
        while(x >0){
            reverse = reverse * 10 + x % 10;
            x/=10;
        }

        if(num == reverse){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
