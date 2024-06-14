package Assignments.Assignment1;

public class Reverse_num {
    public static void main(String[] args) {
        int n = -321;
        long r=0;
        while(n !=0){
            r = r * 10 + (n % 10);
            n/=10;
        }
        if(r>Integer.MAX_VALUE || r <Integer.MIN_VALUE){
            System.out.println(0);
        }
        System.out.println(r);
    }
}
